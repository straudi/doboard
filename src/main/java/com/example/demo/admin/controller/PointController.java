package com.example.demo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PointController {
    @GetMapping("/point")
    @ResponseBody
    public String index() {
        return "index";
    }

}
