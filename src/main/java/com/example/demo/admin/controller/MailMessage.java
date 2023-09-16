package com.example.demo.admin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/mail")
public class MailMessage {
    private String mailaddress;
    private String mailtitle;
    private String mailcontent;

    @GetMapping("/write")
    public String MailMessage(Model model) {
        model.addAttribute("mailaddress",mailaddress);
        model.addAttribute("mailtitle",mailtitle);
        model.addAttribute("mailcontent",mailcontent);
        return "mail_from";
    }

}
