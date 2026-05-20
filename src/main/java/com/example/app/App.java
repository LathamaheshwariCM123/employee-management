package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger =
            LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        EmployeeService service = new EmployeeService();

        Employee e1 =
                new Employee(101, "Rahul", "IT");

        Employee e2 =
                new Employee(102, "Anjali", "HR");

        service.addEmployee(e1);
        service.addEmployee(e2);

        service.displayEmployees();

        logger.info("Application Executed Successfully");
    }
}
