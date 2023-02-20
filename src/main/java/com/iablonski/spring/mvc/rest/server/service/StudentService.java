package com.iablonski.spring.mvc.rest.server.service;

import com.iablonski.spring.mvc.rest.server.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();

    public void saveStudent(Student student);

    public Student getStudent(int id);

    public void deleteStudent(int id);
}
