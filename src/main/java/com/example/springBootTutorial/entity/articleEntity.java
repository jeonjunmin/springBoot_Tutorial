package com.example.springBootTutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class articleEntity {

    @Id //키값
    @GeneratedValue //1,2,3,4...
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    public articleEntity(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
