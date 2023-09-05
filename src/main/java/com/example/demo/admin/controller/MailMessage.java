package com.example.demo.admin.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class MailMessage {
    private String addressee;
    private String title;
    private String content;

}
