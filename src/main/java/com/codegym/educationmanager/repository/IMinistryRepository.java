package com.codegym.educationmanager.repository;

import com.codegym.educationmanager.model.ministry.Ministry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMinistryRepository extends JpaRepository<Ministry, Long> {
    Ministry findMinistryByUsername(String username);
}
