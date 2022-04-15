package com.project1.people.services;

import com.project1.people.Domain.Employee;
import com.project1.people.Repo.InterfaceEmployee;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
@Component

public class EmployeeInterfaceImpl implements InterfaceEmployee {
    private static List<Employee> emp=new ArrayList<>();
    private static int employeeCount = 4;
    static{
        emp.add(new Employee("Ali","ali@gmail.com",27,1));
        emp.add(new Employee("Ayesha","ayesha@gmail.com",30,2));
        emp.add(new Employee("Rimsha","rimsha@gmail.com",40,3));
        emp.add(new Employee("Umar","umar@gmail.com",36,4));

    }
    public List<Employee> findAllEmployee(){
        return emp;
    }
    public Employee findOneEmployee(int id){
        for(Employee employee:emp){
            if(employee.getId()==id){
                return employee;
            }
        }
        return null;

    }
    public Employee saveEmployee(Employee employee){
        if(employee.getId()==null){
            employee.setId(++employeeCount);
        }
        emp.add(employee);
        return employee;
    }
    public Employee deleteEmployee(int id){
        for(Employee employee:emp){
            if(employee.getId()==id){
                emp.remove(employee);
                return employee;
            }

        }
        return null;

    }
}
