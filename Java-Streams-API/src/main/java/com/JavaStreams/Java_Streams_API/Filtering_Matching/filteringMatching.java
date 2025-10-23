package com.JavaStreams.Java_Streams_API.Filtering_Matching;

import com.JavaStreams.Java_Streams_API.Utils.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filteringMatching {

    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Employee1", 5000000, "IT", 25));
        employees.add(new Employee("Employee2", 5000000, "HR", 25));
        employees.add(new Employee("Employee3", 5000000, "DEV", 25));
        employees.add(new Employee("Employee4", 5000000, "QA", 25));
        employees.add(new Employee("Employee5", 5000000, "JANITOR", 25));
        employees.add(new Employee("Employee6", 5000000, "SALES", 25));
        employees.add(new Employee("Employee7", 5000000, "ADMIN", 25));

        return employees;
    }

    public void practice(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Employee1", 5000000, "HR", 25));
        employees.add(new Employee("Employee2", 5000000, "HR", 25));
        employees.add(new Employee("Employee3", 5000000, "HR", 25));
        employees.add(new Employee("Employee4", 5000000, "HR", 25));
        employees.add(new Employee("Employee5", 5000000, "HR", 25));
        employees.add(new Employee("Employee6", 5000000, "HR", 25));
        employees.add(new Employee("Employee7", 5000000, "HR", 25));

        //Filter all employees with Salary > 50K
        List<Employee> employeeSalary = employees.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .toList();

        // Check if anY employee belong to 'HR' Department
        boolean result = employees.stream()
                .anyMatch(e -> e.getDepartment().equals("HR"));

        // Get employees whose name starts with 'A'
        List<Employee> employeesA = employees.stream()
                .filter(e -> e.getName().startsWith("A"))
                .toList();

        //Check if all employee have salary > 30k
        boolean result1 = employees.stream()
                .allMatch(e -> e.getSalary() > 30000);

        //Check if no employee is from 'Intern' Department
        boolean result2 = employees.stream()
                .noneMatch(e -> e.getDepartment().equals("Intern"));

        // Get Employees not from IT Department
        List<Employee> employees1 = employees.stream()
                .filter(e -> !e.getDepartment().equals("IT"))
                .toList();

        //Get employee older than 40
        List<Employee> emplyee40 = employees.stream()
                .filter(e -> e.getAge() > 40)
                .toList();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Filter even number from List
        List<Integer> evenNumber = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        //Check if any Strings is empty
        List<String> strings = Arrays.asList("", "Hello", "Tomato");
        boolean emptyString = strings.stream()
                .anyMatch(String::isEmpty);
    }
}
