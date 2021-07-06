package kr.scalar.api.member.controller;
import kr.scalar.api.member.service.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberServiceImpl memberService;
}
