package com.example.app;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void displayEmployees() {

        for(Employee e : employees) {
            e.display();
            System.out.println("----------------");
        }
    }
}
