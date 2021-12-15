package com.codegym.educationmanager.model.student;

import com.codegym.educationmanager.model.grade.Grade;
import com.codegym.educationmanager.model.role.Role;
import com.codegym.educationmanager.model.score.Score;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = { "roles", "authorities" })
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String email;
    private String phone;
    private String username;
    private String password;
    private Boolean tuition;
    private String image;
    private Boolean status = true;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "student_roles",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private List<Role> roles;
    @ManyToOne(targetEntity = Grade.class)
    private Grade grade;
    @OneToMany(mappedBy = "student")
    @JsonBackReference
    private List<Score> scores;

    public Student() {
    }

    public Student(String code, String name, String email, String phone, String username, String password, Boolean tuition, String image, Boolean status, List<Role> roles, Grade grade, List<Score> scores) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.tuition = tuition;
        this.image = image;
        this.status = status;
        this.roles = roles;
        this.grade = grade;
        this.scores = scores;
    }

    public Student(String code, String name, String email, String phone, Boolean tuition, Boolean status, List<Role> roles) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tuition = tuition;
        this.status = status;
        this.roles = roles;
    }

    public Student(Long id, String code, String name, String email, String phone, Boolean tuition, Boolean status, List<Role> roles) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tuition = tuition;
        this.status = status;
        this.roles = roles;
    }

    public Student(String code, String name, String email, String phone, Boolean tuition) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tuition = tuition;
    }

    public Student(String code, String name, String email, String phone, Boolean tuition, String image, Boolean status, List<Role> roles, Grade grade, List<Score> scores) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tuition = tuition;
        this.image = image;
        this.status = status;
        this.roles = roles;
        this.grade = grade;
        this.scores = scores;
    }

    public Student(Long id, String code, String name, String email, String phone, Boolean tuition, String image, Boolean status, List<Role> roles, Grade grade, List<Score> scores) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tuition = tuition;
        this.image = image;
        this.status = status;
        this.roles = roles;
        this.grade = grade;
        this.scores = scores;
    }

    public Student(Long id, String code, String name, String email, String phone, Boolean tuition, List<Role> roles) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tuition = tuition;
        this.roles = roles;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Boolean getTuition() {
        return tuition;
    }

    public void setTuition(Boolean tuition) {
        this.tuition = tuition;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}
