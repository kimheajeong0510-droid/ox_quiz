package com.my.ox_quiz.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="quiz")
@Data
public class QuizEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Boolean answer;
    private String writer;
}
