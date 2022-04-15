package com.project1.people.services;

import com.project1.people.Domain.Student;
import com.project1.people.Domain.course;

import com.project1.people.Repo.InterfaceStudent;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class StudentInterfaceImpl implements InterfaceStudent {
    private static List<Student> stu=new ArrayList<>();
    private static int studentCount = 13;
    static{
        Set<course> courseSet = new HashSet<>();

        courseSet.add(new course(102,"Data Structures",4,"prof. Aksam",true));
        courseSet.add(new course(101,"Discrete Structures",3,"prof. Iqra",false));
        courseSet.add(new course(103,"Object oriented programming",4,"prof. Allahbux",true));
        courseSet.add(new course(104,"Operating System",4,"prof. Chaudary Nadeem",true));
        courseSet.add(new course(115,"Diferential Equations",3,"prof. Majid",false));

       stu.add(new Student("Amna","amnasolat@gmail.com",20,10,courseSet));
        stu.add(new Student("fiza","fizasolat@gmail.com",16,11,courseSet));
        stu.add(new Student("sohaib","sohaibsolat@gmail.com",20,12,courseSet));
        stu.add(new Student("taizu","taizuamna@gmail.com",10,13,courseSet));

    }
    public List<Student> findAllStudents(){
       return stu;
    }





    public Student findOneStudent(int id){
        for(Student student:stu){
            if(student.getRegNum()==id){
                return student;
            }
        }
        return null;

    }
    public Student saveStudent(Student student){
         if(student.getRegNum()==null){
             student.setRegNum(++studentCount);
         }
         stu.add(student);
         return student;
    }
    public Student deleteStudent(int id){
        for(Student student:stu){
            if(student.getRegNum()==id){
                stu.remove(student);
                return student;
            }

        }
        return null;

    }
    public List<Student> ListOfStudentsInCourse(Set<course> subject ){
        for(Student student:stu){
            if(student.getCourseSet().containsAll(subject)){
               return stu;
            }
        }
        return null;

    }

}
