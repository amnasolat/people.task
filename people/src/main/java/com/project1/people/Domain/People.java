package com.project1.people.Domain;



import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

public class People {
    private String name;
    private String email;
    private Integer age;
   // @DateTimeFormat(pattern = "yyyy/MM/dd")
  // @JsonFormat(pattern="yyyy/MM/dd")
    //private Date birthDate;


    public People(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
       //this.birthDate=birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
