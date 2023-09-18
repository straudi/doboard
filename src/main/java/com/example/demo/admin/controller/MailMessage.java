package com.example.demo.admin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@Controller
@ResponseBody
@RequestMapping("/mail")
public class MailMessage {
    private String mailaddress;
    private String mailtitle;
    private String mailcontent;


    @GetMapping("/writer")
    public String MailWriter(Model model) {
        this.mailaddress = "메일 주소";
        this.mailtitle = "메일 제목";
        this.mailcontent = "메일 내용";
        model.addAttribute("mailaddress",mailaddress);
        model.addAttribute("mailtitle",mailtitle);
        model.addAttribute("mailcontent",mailcontent);
        return "mail_from";
    }

    @GetMapping("/List/{str}")
    public String MailList(@PathVariable String type, String str) {
        if(Objects.equals(str, "search")){
            return "/mail/search";
        } else {
            return "mail_list";
        }
    }

    @GetMapping("/search")
    @PostMapping("/search")
    public String MailSearch(@RequestBody  String type, String str) {

        return "mail_search";
    }
}
