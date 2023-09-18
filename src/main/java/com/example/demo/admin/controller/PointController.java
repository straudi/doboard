package com.example.demo.admin.controller;

import com.example.demo.admin.domain.Point;
import com.example.demo.admin.domain.User;
import com.example.demo.admin.service.PointService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
//@Controller
@RequestMapping("/point")
public class PointController {

    private final PointService pointService;

    // 리스트 조회 ( 전체카운트, 전체합계, 검색, 페이징)
    @GetMapping("/list")
    public List<Point> list(Model model) {
        List<Point> pointList = this.pointService.getList();
        return pointList;
    }

    // 삭제
    @DeleteMapping("/delete")
    public String delete(@RequestParam List<String> pointIds) {
        for(int i=0; i<pointIds.size(); i++){
            Integer id = Integer.valueOf(pointIds.get(i));
            this.pointService.deletePoint(id);
        }
        return "success";
    }

    // 포인트 증감 설정 (회원아이디, 포인트내용, 포인트,
}
