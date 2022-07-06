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

    @Column(nullable = false, columnDefinition = "false")
    private Boolean completed;

    @Builder
    public TodoEntity(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
