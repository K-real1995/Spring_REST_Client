package com.kirillsoklakov.spring.rest;

import com.kirillsoklakov.spring.rest.cofiguration.MyConfig;
import com.kirillsoklakov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {

    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println("All employee in database: " + allEmployees);
        System.out.println("////////");
        try {
            Employee oneEmployee = communication.getEmployee(1);
            System.out.println("Employee by id: 1 is" + oneEmployee);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

        Employee emp = new Employee("Svetlana", "Govorova", "HR", 1500);
        communication.saveEmployee(emp);

        emp.setId(6);
        communication.saveEmployee(emp);

        communication.deleteEmployee(emp.getId());
    }
}
