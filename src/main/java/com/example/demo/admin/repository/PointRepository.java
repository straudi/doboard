package com.example.demo.admin.repository;

import com.example.demo.admin.domain.Point;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PointRepository extends JpaRepository<Point, Integer> {
    Page<Point> findAll(Pageable pageable);
}
