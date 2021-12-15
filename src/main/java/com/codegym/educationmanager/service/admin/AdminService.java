package com.codegym.educationmanager.service.admin;

import com.codegym.educationmanager.model.admin.Admin;
import com.codegym.educationmanager.repository.IAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService{
    @Autowired
    private IAdminRepository adminRepository;
    @Override
    public Admin findAdminByOldPassword(String oldpass) {
        return adminRepository.findAdminByPassword(oldpass);
    }

    @Override
    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }
}
