package kr.scalar.api.admin.service;
import kr.scalar.api.admin.domain.AdminDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface AdminService{
    void saveID(AdminDto AVO);
    void deleteID(String ID);
    boolean loginID(String ID, String PW);
    ArrayList<AdminDto> viewAdminAccountList();
}
