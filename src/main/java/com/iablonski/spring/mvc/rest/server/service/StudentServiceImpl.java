package com.iablonski.spring.mvc.rest.server.service;

import com.iablonski.spring.mvc.rest.server.dao.StudentDao;
import com.iablonski.spring.mvc.rest.server.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentDao studentDao;

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    @Autowired
    public void setEmployeeDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
