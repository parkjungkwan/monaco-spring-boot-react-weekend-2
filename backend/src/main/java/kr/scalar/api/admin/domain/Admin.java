package kr.scalar.api.admin.domain;
import javax.persistence.*;

@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private String adminId;
    @Column private String adminPass;
    @Column private String adminName;
}
