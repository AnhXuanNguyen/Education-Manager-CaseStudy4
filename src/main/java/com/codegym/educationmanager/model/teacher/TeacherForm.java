package com.codegym.educationmanager.model.teacher;

import com.codegym.educationmanager.model.grade.Grade;
import com.codegym.educationmanager.model.role.Role;
import com.codegym.educationmanager.model.subject.Subject;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

public class TeacherForm {
    private Long id;
    @NotEmpty(message = "khong duoc de trong")
    private String name;
    @NotEmpty(message = "khong duoc de trong")
    private String email;
    @NotEmpty(message = "khong duoc de trong")
    private String phone;
    @NotEmpty(message = "khong duoc de trong")
    private String username;
    @NotEmpty(message = "khong duoc de trong")
    private String password;
    private MultipartFile image;
    private List<Role> roles;
    private List<Subject> subjects;
    private List<Grade> grades;

    public TeacherForm() {
    }

    public TeacherForm(String name, String email, String phone, String username, String password, MultipartFile image, List<Role> roles, List<Subject> subjects) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.image = image;
        this.roles = roles;
        this.subjects = subjects;
    }

    public TeacherForm(Long id, String name, String email, String phone, String username, String password, MultipartFile image, List<Role> roles, List<Subject> subjects, List<Grade> grades) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.image = image;
        this.roles = roles;
        this.subjects = subjects;
        this.grades = grades;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
