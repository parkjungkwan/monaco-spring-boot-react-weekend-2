package kr.scalar.api.admin.domain;

import lombok.Data;

@Data
public class AdminDto {
    private long adminId;
    private String adminPass;
    private String adminNAME;
}

