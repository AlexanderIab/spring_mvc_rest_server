package com.iablonski.spring.mvc.rest.server.controller;

import com.iablonski.spring.mvc.rest.server.exception_handling.NoSuchStudentException;
import com.iablonski.spring.mvc.rest.server.service.StudentService;
import com.iablonski.spring.mvc.rest.server.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class MyRESTController {

    private StudentService studentService;

    @GetMapping("students")
    public List<Student> showAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("students/{id}")
    public Student getStudent(@PathVariable int id){
        Student student = studentService.getStudent(id);
        if (student == null) throw new NoSuchStudentException("There is no student with id = " + id + " in Database");
        return student;
    }

    @PostMapping("students")
    public Student addNewStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @PutMapping("students")
    public Student updateStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping ("students/{id}")
    public String deleteStudent(@PathVariable int id){
        Student student = studentService.getStudent(id);
        if (student == null) throw new NoSuchStudentException("There is no student with id = " + id + " in Database");
        studentService.deleteStudent(id);
        return "Student with ID= " + id + " was deleted";
    }

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}
