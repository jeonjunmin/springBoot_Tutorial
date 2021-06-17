package com.example.springBootTutorial.controller;

import com.example.springBootTutorial.dto.articleDto;
import com.example.springBootTutorial.entity.articleEntity;
import com.example.springBootTutorial.repository.articleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class firstController {
    @Autowired //스프링부트가 미리 생성해 놓은 객체를 가져다가 자동연결
    private articleRepository articleRpstr;

    @GetMapping("/main")
    public  String niceToMeetYou(Model model){
        System.out.println("/main");

        model.addAttribute("username","홍길동");
        //return "greeting.html";
        return "form";
    }

    @PostMapping("/articles/create")
    public  String createArticle(articleDto articleForm){
        System.out.println("/articles/create");
        //System.out.println(articleForm.toString());

        //1. Dto를 Entity로 변환
        articleEntity articleET = articleForm.toEntity();
        //System.out.println(articleET.toString());

        //2. Repository에게 Entity를 DB로 저장하게 함
        articleEntity saved = articleRpstr.save(articleET);
        System.out.println("결과-->"+saved.toString());

        return "";
    }
}
