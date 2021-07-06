package kr.scalar.api.member.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long memberId;
    @Column private String stringId;
    @Column private String password;
    @Column private String name;
    @Column private String birth;
}
