package kr.scalar.api.admin.service;

import kr.scalar.api.admin.domain.AdminDto;
import kr.scalar.api.admin.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
@Log4j2
@Transactional
public class AdminServiceImpl  implements AdminService{

    private final AdminRepository adminRepository;

    @Override
    public void saveID(AdminDto AVO){

    }
    @Override
    public void deleteID(String ID){

    }
    @Override
    public boolean loginID(String ID, String PW){
        return false;
    }
    @Override
    public ArrayList<AdminDto> viewAdminAccountList() {    //전체 관리자 조회

        return null;
    }

}
