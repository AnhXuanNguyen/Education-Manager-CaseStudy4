package com.codegym.educationmanager.model.grade;

import com.codegym.educationmanager.model.blog.Blog;
import com.codegym.educationmanager.model.student.Student;
import com.codegym.educationmanager.model.teacher.Teacher;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne(targetEntity = Teacher.class)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    @OneToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;
    @OneToMany(mappedBy = "grade")
    @JsonBackReference
    private List<Student> students;

    public Grade() {
    }

    public Grade(String name, Teacher teacher, Blog blog, List<Student> students) {
        this.name = name;
        this.teacher = teacher;
        this.blog = blog;
        this.students = students;
    }

    public Grade(String name, Teacher teacher, Blog blog) {
        this.name = name;
        this.teacher = teacher;
        this.blog = blog;
    }

    public Grade(Long id, String name, Teacher teacher, Blog blog, List<Student> students) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.blog = blog;
        this.students = students;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
