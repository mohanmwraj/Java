package com.JavaStreams.Java_Streams_API.Utils;

import com.JavaStreams.Java_Streams_API.Filtering_Matching.Employee;

import java.util.ArrayList;
import java.util.List;

public class Input {
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

    public static List<String> getStrings(){
        List<String> strings = new ArrayList<>();

        strings.add("string1");
        strings.add("string2");
        strings.add("string3");
        strings.add("string4");
        strings.add("string5");
        strings.add("string6");
        strings.add("string7");
        strings.add("string8");
        strings.add("string9");

        return strings;
    }

    public static List<Integer> getNumbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(12);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);

        return numbers;
    }
}
