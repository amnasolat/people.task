package com.project1.people.web;


import com.project1.people.Domain.Employee;
import com.project1.people.Domain.Student;
import com.project1.people.services.EmployeeInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeInterfaceImpl EmployeeServices;
    @GetMapping("/Employee")
    public List<Employee> RetrieveAllEmployee(){
        return EmployeeServices.findAllEmployee();
    }
    @GetMapping("/Employee/{code}")
    public Employee RetrieveOneEmployee(@PathVariable int code){
        return EmployeeServices.findOneEmployee(code);
    }
    @PostMapping("/Employee")
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = EmployeeServices.saveEmployee(employee);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEmployee.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
    @DeleteMapping("/courses/{id}")
    public void deleteEmployee(@PathVariable int id) {
        Employee employee = EmployeeServices.deleteEmployee(id);

    }


}
