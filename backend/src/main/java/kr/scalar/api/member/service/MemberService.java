package kr.scalar.api.member.service;

import kr.scalar.api.member.domain.Member;

public interface MemberService {
    //회원가입
    void signUpMember(Member user);
    //내 정보 조회
    Member viewMember(String username);
    //내 정보 수정
    void modifyMember(Member user);
    //회원 탈퇴
    void deleteMember(Member user);
}
