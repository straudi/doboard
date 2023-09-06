package com.example.demo.admin.service;

import com.example.demo.admin.domain.Point;
import com.example.demo.admin.repository.PointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PointService {
    private final PointRepository pointRepository;

    public List<Point> getList() {
        return this.pointRepository.findAll();
    }
}
