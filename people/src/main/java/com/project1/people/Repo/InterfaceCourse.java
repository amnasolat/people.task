package com.project1.people.Repo;

import com.project1.people.Domain.Student;
import com.project1.people.Domain.course;

import java.util.List;

public interface InterfaceCourse {
    public List<course> findAllCourses();
    public course findOneCourse(int courseCode);
    public course saveCourse(course subject);
    public course deleteCourse(int id);

}
