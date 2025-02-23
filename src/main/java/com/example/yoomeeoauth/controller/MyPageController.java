package com.example.yoomeeoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPageController {

    @GetMapping("/my")
    public String myPage() {

        return "my";
    }
}
