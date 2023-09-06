package com.example.demo.admin.controller;

import com.example.demo.admin.domain.Point;
import com.example.demo.admin.service.PointService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/point")
public class PointController {

    private final PointService pointService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Point> pointList = this.pointService.getList();
        model.addAttribute("pointList", pointList);
        return "point_list";
    }

}
