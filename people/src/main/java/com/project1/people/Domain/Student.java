package com.project1.people.Domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.Set;

public class Student extends People{

    private Integer regNum;
    private Set<course> courseSet;



    public Student(String name,String email,Integer age,Integer regNum,Set<course> courseSet) {
        super(name,email,age);
        this.regNum = regNum;
        this.courseSet=courseSet;


    }

    public Integer getRegNum() {
        return regNum;
    }

    public void setRegNum(Integer regNum) {
        this.regNum = regNum;
    }

    public Set<course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<course> courseSet) {
        this.courseSet = courseSet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNum=" + regNum +
                ", courseSet=" + courseSet +
                '}';
    }
}
