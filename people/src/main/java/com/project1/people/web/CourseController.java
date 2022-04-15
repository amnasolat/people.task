package com.project1.people.web;

import com.project1.people.Domain.course;
import com.project1.people.services.courseInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.PortUnreachableException;
import java.net.URI;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private courseInterfaceImpl CourseServices;
    @GetMapping("/course")
    public List<course> RetrieveAllCourses(){
        return CourseServices.findAllCourses();
    }
    @GetMapping("/course/{code}")
    public course RetrieveOneCourse(@PathVariable int code){
        return CourseServices.findOneCourse(code);
    }
    @PostMapping("/courses")
    public ResponseEntity<Object> createCourse(@RequestBody course subject) {
        course savedCourse = CourseServices.saveCourse(subject);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedCourse.getCourseCode())
                .toUri();

        return ResponseEntity.created(location).build();
    }
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable int id) {
        course subject = CourseServices.deleteCourse(id);

    }


}
