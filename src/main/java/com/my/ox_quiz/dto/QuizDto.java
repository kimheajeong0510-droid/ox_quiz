package com.my.ox_quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizDto {
    private Long id;
    private String content;
    private Boolean answer;
    private String writer;

    // dto -> entity
    public static QuizDto toEntity(QuizDto dto) {
        QuizDto quizDto = new QuizDto();
        quizDto.setId(dto.getId());
        quizDto.setContent(dto.content);
        quizDto.setAnswer(dto.getAnswer());
        quizDto.setWriter(dto.getWriter());
        return quizDto;
    }

    // entity -> dto
    public static QuizDto toDto(QuizDto quizDto) {
        return new QuizDto(
                quizDto.getId(),
                quizDto.getContent(),
                quizDto.getAnswer(),
                quizDto.getWriter()
        );
    }
}
