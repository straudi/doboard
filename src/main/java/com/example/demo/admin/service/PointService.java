package com.example.demo.admin.service;

import com.example.demo.admin.domain.Point;
import com.example.demo.admin.domain.User;
import com.example.demo.admin.repository.PointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PointService {
    private final PointRepository pointRepository;

    public List<Point> getList() {
        return this.pointRepository.findAll();
    }

    @Transactional
    public void deletePoint(Integer id){
        this.pointRepository.deleteById(id);
    }

    public ResponseEntity<Point> updatePoint(Integer po_id, Point point){
        Point oldPoint = this.pointRepository.findById(point.getPo_id()).orElse(null);
        oldPoint.setPo_point(point.getPo_point());
        oldPoint.setPo_use_point(point.getPo_use_point());
        oldPoint.setPo_mb_point(point.getPo_mb_point());
        Point newPoint = this.pointRepository.save(oldPoint);
        return ResponseEntity.ok(newPoint);
    }

}
