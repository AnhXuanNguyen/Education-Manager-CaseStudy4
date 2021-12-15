package com.codegym.educationmanager.repository;

import com.codegym.educationmanager.model.admin.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Long> {
    Admin findAdminByUsername(String username);
    Admin findAdminByPassword(String password);
}
