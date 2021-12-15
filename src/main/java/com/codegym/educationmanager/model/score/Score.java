package com.codegym.educationmanager.model.score;

import com.codegym.educationmanager.model.student.Student;

import javax.persistence.*;

@Entity
@Table(name = "scores")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double score;
    @ManyToOne(targetEntity = Student.class)
    private Student student;

    public Score() {
    }

    public Score(Double score, Student student) {
        this.score = score;
        this.student = student;
    }

    public Score(Long id, Double score, Student student) {
        this.id = id;
        this.score = score;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
