package kr.scalar.api.member.domain;

import lombok.Data;

@Data
public class MemberDto {
    private String memberId;
    private String memberPass;
    private String name;
    private String birth;
}
