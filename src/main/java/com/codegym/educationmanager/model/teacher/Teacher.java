package com.codegym.educationmanager.model.teacher;

import com.codegym.educationmanager.model.grade.Grade;
import com.codegym.educationmanager.model.role.Role;
import com.codegym.educationmanager.model.subject.Subject;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = { "roles", "authorities" })
@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String image;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "teacher_roles",
            joinColumns = {@JoinColumn(name = "teacher_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private List<Role> roles;
    @ManyToMany(targetEntity = Subject.class)
    private List<Subject> subjects;
    @OneToMany(mappedBy = "teacher")
    @JsonBackReference
    private List<Grade> grades;

    public Teacher() {
    }

    public Teacher(Long id, String name, String email, String phone, String username, String password, String image, List<Role> roles, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.image = image;
        this.roles = roles;
        this.subjects = subjects;
    }

    public Teacher(String name, String email, String phone, String username, String password, String image, List<Role> roles, List<Subject> subjects) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.image = image;
        this.roles = roles;
        this.subjects = subjects;
    }

    public Teacher(String name, String email, String phone, String username, String password, List<Role> roles, List<Subject> subjects) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.subjects = subjects;
    }

    public Teacher(Long id, String name, String email, String phone, String username, String password, List<Role> roles, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.subjects = subjects;
    }

    public Teacher(String name, String email, String phone, String username, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public Teacher(Long id, String name, String email, String phone, String username, String password, List<Role> roles) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.roles = roles;
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
}
