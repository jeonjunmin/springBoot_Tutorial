package com.example.springBootTutorial.dto;

import com.example.springBootTutorial.entity.articleEntity;

public class articleDto {

    private String title;
    private String content;

    public articleDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public articleEntity toEntity(){
        articleEntity articleET = null;

        return new articleEntity(null, title, content );
    }
}
