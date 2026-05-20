package com.my.ox_quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private Long no;
    private String id;
    private String password;

    // dto -> entity
    public static MemberDto toEntity(MemberDto dto) {
        MemberDto memberDto = new MemberDto();
        memberDto.setNo(dto.getNo());
        memberDto.setId(dto.getId());
        memberDto.setPassword(dto.getPassword());
        return memberDto;
    }

    // entity -> dto
    public static MemberDto toDto(MemberDto memberDto) {
        return new MemberDto(
                memberDto.getNo(),
                memberDto.getId(),
                memberDto.getPassword()
        );
    }
}
