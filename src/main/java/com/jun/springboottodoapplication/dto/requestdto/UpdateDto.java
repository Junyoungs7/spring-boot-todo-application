package com.jun.springboottodoapplication.dto.requestdto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateDto {

    private String title;
    private String content;

    @Builder
    public UpdateDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
