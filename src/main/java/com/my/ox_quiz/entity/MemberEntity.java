package com.my.ox_quiz.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="member")
@Data
public class MemberEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;
    private String id;
    private String password;

    @Enumerated(EnumType.STRING)
    private RoleType role;
}
