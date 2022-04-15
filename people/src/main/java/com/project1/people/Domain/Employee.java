package com.project1.people.Domain;

import java.util.Date;

public class Employee extends People{

    private Integer id;


    public Employee(String name,String email,Integer age,Integer id) {
        super(name,email,age);
        this.id = id;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }





    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +" "+super.toString()+
                '}';
    }
}
