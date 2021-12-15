package com.codegym.educationmanager.model.student;

import com.codegym.educationmanager.model.grade.Grade;
import com.codegym.educationmanager.model.role.Role;
import com.codegym.educationmanager.model.score.Score;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class StudentForm {
    private Long id;
    @NotEmpty(message = "khong de trong")
    private String code;
    @NotEmpty(message = "khong de trong")
    private String name;
    @NotEmpty(message = "khong de trong")
    private String email;
    @NotEmpty(message = "khong de trong")
    private String phone;
    @NotEmpty(message = "khong de trong")
    private String username;
    @NotEmpty(message = "khong de trong")
    private String password;
    private Boolean tuition;
    private MultipartFile image;
    private Boolean status = true;

    private List<Role> roles;
    private Grade grade;
    private List<Score> scores;

    public StudentForm() {
    }

    public StudentForm(String code, String name, String email, String phone, Boolean tuition, MultipartFile image, Boolean status, List<Role> roles, Grade grade, List<Score> scores) {
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

    public StudentForm(Long id, String code, String name, String email, String phone, Boolean tuition, Boolean status) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tuition = tuition;
        this.status = status;
    }

    public StudentForm(Long id, String code, String name, String email, String phone, Boolean tuition, MultipartFile image, Boolean status, List<Role> roles, Grade grade, List<Score> scores) {
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

    public StudentForm(String code, String name, String email, String phone, String username, String password, Boolean tuition, MultipartFile image, Boolean status, List<Role> roles, Grade grade, List<Score> scores) {
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

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
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
