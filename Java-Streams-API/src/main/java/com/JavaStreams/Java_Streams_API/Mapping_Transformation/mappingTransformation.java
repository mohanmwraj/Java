package com.JavaStreams.Java_Streams_API.Mapping_Transformation;

import com.JavaStreams.Java_Streams_API.Filtering_Matching.*;
import com.JavaStreams.Java_Streams_API.Utils.Employee;

import java.util.Arrays;
import java.util.List;

public class mappingTransformation {

    public void practice(){

        List<String> strings = Arrays.asList(
                "",
                "Hello",
                "Tomato"
        );

        List<Employee> employees = filteringMatching.getEmployees();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Convert list of strings to upper case
        List<String> upperString = strings.stream()
                .map(String::toUpperCase)
                .toList();

        //Extract EmployeeNames
        List<String> employeeName = employees.stream()
                .map(Employee::getName)
                .toList();

        //Get Squares of numbers
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();

        //Extract Employee Salaries
        List<Float> employeeSalary = employees.stream()
                .map(Employee::getSalary)
                .toList();

        //Convert List of Integers to String
        List<String> stringInt = numbers.stream()
                .map(String::valueOf)
                .toList();

        //Get length of each string
        List<Integer> strLength = strings.stream()
                .map(String::length)
                .toList();

        //Append domain name to employee names
        List<String> emailName = employees.stream()
                .map(e -> e.getName() + "@gmail.com")
                .toList();

        //Capitalize first letter of each word
        List<String> captializedWord = strings.stream()
                .map(u -> Character.toUpperCase(u.charAt(0)) +
                        u.substring(1))
                .toList();

        //Extract Distinct departments
        List<String> departments = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .toList();

        //Convert list of doubles to integers
        List<Double> doubles = Arrays.asList(1.2, 2.3, 4.5, 6.7);

        List<Integer> convertedDoubles = doubles.stream()
                .map(Double::intValue)
                .toList();
    }
}
