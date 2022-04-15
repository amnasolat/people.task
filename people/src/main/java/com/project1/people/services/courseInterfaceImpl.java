package com.project1.people.services;

import com.project1.people.Domain.Employee;
import com.project1.people.Domain.Student;
import com.project1.people.Domain.course;
import com.project1.people.Repo.InterfaceCourse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Component
public class courseInterfaceImpl implements InterfaceCourse {
    private static List<course> subj=new ArrayList<>();
    private static int courseCount = 3;
    static{


        subj.add(new course(102,"Data Structures",4,"prof. Aksam",true));
        subj.add(new course(101,"Discrete Structures",3,"prof. Iqra",false));
        subj.add(new course(103,"Object oriented programming",4,"prof. Allahbux",true));
        subj.add(new course(104,"Operating System",4,"prof. Chaudary Nadeem",true));
        subj.add(new course(115,"Diferential Equations",3,"prof. Majid",false));

    }
    public List<course> findAllCourses(){
        return subj;
    }
    public course findOneCourse(int courseCode){
        for(course subject:subj){
            if(subject.getCourseCode()==courseCode){
                return subject;
            }
        }
       return null;
    }
    public course saveCourse(course subject){
        if(subject.getCourseCode()==null){
            subj.add(subject);
        }
        return subject;
    }
    public course deleteCourse(int code){
        for(course subject:subj){
            if(subject.getCourseCode()==code){
                subj.remove(subject);
                return subject;
            }

        }
        return null;

    }
    //public List<Student> ListOfStudentsInCourse(int id);
}
