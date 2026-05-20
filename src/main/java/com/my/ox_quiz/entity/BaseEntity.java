package com.my.ox_quiz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@EnableJpaAuditing
public class BaseEntity {
    // 생성일
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;
    // 수정일
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
