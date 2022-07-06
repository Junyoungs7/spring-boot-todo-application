package com.jun.springboottodoapplication.dto.requestdto;

import com.jun.springboottodoapplication.repository.TodoEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SaveDto {

    private String title;
    private String content;

    @Builder
    public SaveDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public TodoEntity toEntity(){
        return TodoEntity.builder()
                .title(title)
                .content(content)
                .build();
    }

}
