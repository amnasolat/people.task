package com.project1.people.Repo;

import com.project1.people.Domain.Employee;


import java.util.List;

public interface InterfaceEmployee {
    public List<Employee> findAllEmployee();
    public Employee findOneEmployee(int id);
    public Employee saveEmployee(Employee employee);
    public Employee deleteEmployee(int id);
}
