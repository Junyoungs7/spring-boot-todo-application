package com.jun.springboottodoapplication.repository;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Boolean completed = false;

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }

    @Builder
    public TodoEntity(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
