package com.jun.springboottodoapplication.controller;

import com.jun.springboottodoapplication.dto.requestdto.SaveDto;
import com.jun.springboottodoapplication.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Controller
public class TodoInsertController {

    private final TodoService todoService;

    @GetMapping("/new")
    public String inputTodo(){
        return "insert";
    }

    @PostMapping("/new")
    public String input(TodoInsertForm todoInsertForm){
        SaveDto saveDto = SaveDto.builder()
                .title(todoInsertForm.getTitle())
                .content(todoInsertForm.getContent())
                .build();

        todoService.save(saveDto);
        return "index";
    }
}
