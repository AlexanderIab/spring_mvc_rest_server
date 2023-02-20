package com.iablonski.spring.mvc.rest.server.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "faculty")
    private String faculty;
    @Column(name = "grade")
    private int grade;

    public Student(String name, String surname, String faculty, int grade) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.grade = grade;
    }
}
