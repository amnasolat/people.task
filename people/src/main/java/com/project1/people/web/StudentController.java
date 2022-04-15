package com.project1.people.web;

import com.project1.people.Domain.Student;
import com.project1.people.Domain.course;
import com.project1.people.services.StudentInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

public class StudentController {
    @Autowired
    private StudentInterfaceImpl studentServices;
    @GetMapping("/students")
    public List<Student> RetrieveAllStudents(){
        return studentServices.findAllStudents();
    }
    @GetMapping("/student/{code}")
    public Student RetrieveOneStudent(@PathVariable int code){
        return studentServices.findOneStudent(code);
    }
    @GetMapping()
    public Student RetrieveAllStudentInCourse(@PathVariable int code){
        return studentServices.ListOfStudentsInCourse(studentServices.findAllStudents());
    }

    @PostMapping("/students")
    public ResponseEntity<Object> createStudent(@RequestBody Student student) {
        Student savedStudent = studentServices.saveStudent(student);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedStudent.getRegNum())
                .toUri();

        return ResponseEntity.created(location).build();
    }
    @DeleteMapping("/courses/{id}")
    public void deleteStudent(@PathVariable int id) {
        Student student = studentServices.deleteStudent(id);

    }
}
