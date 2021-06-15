package com.example.springBootTutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstController {

    @GetMapping("/main")
    public  String niceToMeetYou(Model model){
        System.out.println("start /main");
        model.addAttribute("username","홍길동");
        //return "greeting.html";
        return "greeting";
    }
}
