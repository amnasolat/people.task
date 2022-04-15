package com.project1.people.Repo;

import com.project1.people.Domain.Student;
import com.project1.people.Domain.course;


import java.util.List;
import java.util.Set;

public interface InterfaceStudent {
    public List<Student> findAllStudents();
    public Student findOneStudent(int id);
    public Student saveStudent(Student student);
    public Student deleteStudent(int id);
    public List<Student> ListOfStudentsInCourse(Set<course> subject );

}
