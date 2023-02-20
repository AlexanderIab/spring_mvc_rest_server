package com.iablonski.spring.mvc.rest.server.dao;

import com.iablonski.spring.mvc.rest.server.entity.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> getAllStudents();

    public void saveStudent(Student student);

    public Student getStudent(int id);

    public void deleteStudent(int id);
}
