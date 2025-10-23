package com.JavaStreams.Java_Streams_API.Grouping_Partitioning;

import com.JavaStreams.Java_Streams_API.Utils.Employee;
import com.JavaStreams.Java_Streams_API.Utils.Input;
import com.JavaStreams.Java_Streams_API.Utils.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingPartitioning {
    public void practice(){

        //Group Employees by department
        Map<String, List<Employee>> groupEmployees = Input.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        //Group Employee by Age
        Map<Integer, List<Employee>> groupEmployeesByAge = Input.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        //Group numbers by even and odd
        Map<Boolean, List<Integer>> groupNumbers = Input.getNumbers().stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        //Partition Employees based on Salary > 50k
        Map<Boolean, List<Employee>> partitionEmp = Input.getEmployees().stream()
                .collect(Collectors.partitioningBy(
                        e -> e.getSalary() > 5000
                ));

        //Group employee by departments and count
        Map<String, Long> groupEmployeesByDepartment = Input.getEmployees().stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));

        //Group Employees by department and list names
        Map<String, List<String>> groupEmp = Input.getEmployees().stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));

        //Group Strings by Length
        Map<Integer, List<String>> groupStrings = Input.getStrings().stream()
                .collect(Collectors.groupingBy(String::length));

        //Partition Number by greater than 100
        Map<Boolean, List<Integer>> partitionNumber = Input.getNumbers().stream()
                .collect(Collectors.partitioningBy(n -> n > 100));

        //Group Employees by Salary Range (above/below 50k)
        Map<String, List<Employee>> salaryRange = Input.getEmployees().stream()
                .collect(Collectors.groupingBy(
                        e-> e.getSalary() > 5000 ? "HIGH" : "LOW"
                ));

        //Partition Students by Pass/Fail
        Map<Boolean, List<Student>> passedStudents = Input.getStudents().stream()
                .collect(Collectors.partitioningBy(s -> s.getMarks() > 40));

    }
}
