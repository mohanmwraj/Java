package com.JavaStreams.Java_Streams_API.Reducing_Aggregation;

import com.JavaStreams.Java_Streams_API.Utils.Employee;
import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReducingAggregation {
    public void practice(){

        //Total Salary of All Employees
        Float totalSalary = Input.getEmployees().stream()
                .map(Employee::getSalary)
                .reduce(0.1F, Float::sum);

        //Find max Salary in each department
        Map<String, Optional<Employee>> departmentMaxSalary = Input.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        // Count Employees in IT Department
        long totalEmployeeInIt = Input.getEmployees().stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .count();

        //Find Average Salary
        Double averageSalary = Input.getEmployees().stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));

        //Find highest salary overall
        Float highestSalary = Input.getEmployees().stream()
                .map(Employee::getSalary)
                .max(Float::compare)
                .get();

        //Find lowest salary overall
        Float lowestSalary = Input.getEmployees().stream()
                .map(Employee::getSalary)
                .min(Float::compare)
                .get();

        //Sum of Numbers in a list
        int sum = Input.getNumbers().stream()
                .reduce(0, Integer::sum);

        //Product of all numbers
        int product = Input.getNumbers().stream()
                .reduce(1, (a, b) -> a * b);

        //Find Longest String
        String longestString = Input.getStrings().stream()
                .max(Comparator.comparing(String::length))
                .get();

        //Count Distinct Departments
        long distinctDepartments = Input.getEmployees().stream()
                .map(Employee::getDepartment)
                .distinct()
                .count();
    }
}
