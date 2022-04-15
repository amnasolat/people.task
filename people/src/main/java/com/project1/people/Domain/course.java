package com.project1.people.Domain;

import java.util.Date;

public class course {
    private Integer courseCode;
    private String name;
    private Integer creditHours;
    private String courseInstructor;
    private boolean CourseLab;

    public course(Integer courseCode, String name, Integer creditHours, String courseInstructor, boolean courseLab) {
        this.courseCode = courseCode;
        this.name = name;
        this.creditHours = creditHours;
        this.courseInstructor = courseInstructor;
        CourseLab = courseLab;
    }

    public Integer getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Integer courseCode) {
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(Integer creditHours) {
        this.creditHours = creditHours;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public boolean isCourseLab() {
        return CourseLab;
    }

    public void setCourseLab(boolean courseLab) {
        CourseLab = courseLab;
    }
}
