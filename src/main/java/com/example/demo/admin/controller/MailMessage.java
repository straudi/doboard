package com.example.demo.admin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MailMessage {
    private String addressee;
    private String title;
    private String content;

    @GetMapping("/mailwrite")
    public String MailMessage(Model model) {
        model.addAttribute("mailtitle","메일제목");
        /* 테스트 */
        return "mail_from";
    }

}
