package com.codegym.educationmanager.service.admin;

import com.codegym.educationmanager.model.admin.Admin;

public interface IAdminService {
    Admin findAdminByOldPassword(String oldpass);
    Admin save(Admin admin);
}
