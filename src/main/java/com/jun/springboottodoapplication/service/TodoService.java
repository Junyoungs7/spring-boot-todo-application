package com.jun.springboottodoapplication.service;

import com.jun.springboottodoapplication.dto.requestdto.SaveDto;
import com.jun.springboottodoapplication.dto.requestdto.UpdateDto;
import com.jun.springboottodoapplication.repository.TodoEntity;
import com.jun.springboottodoapplication.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    @Transactional
    public Long save(SaveDto saveDto){
        return todoRepository.save(saveDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, UpdateDto updateDto){
        TodoEntity todo = todoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 아이템이 없습니다. id = " + id));
        todo.update(updateDto.getTitle(), updateDto.getContent());
        return id;
    }




}
