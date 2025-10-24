package com.JavaStreams.Java_Streams_API.Utils;

import java.util.ArrayList;
import java.util.List;

public class Input {
    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Employee1", 5000000, "IT", 25));
        employees.add(new Employee("Employee2", 12342, "HR", 25));
        employees.add(new Employee("Employee3", 5000000, "DEV", 25));
        employees.add(new Employee("Employee4", 12334213, "QA", 25));
        employees.add(new Employee("Employee5", 3345, "JANITOR", 25));
        employees.add(new Employee("Employee6", 12121, "SALES", 25));
        employees.add(new Employee("Employee7", 2312321, "ADMIN", 25));

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

    public static List<Student> getStudents(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Student1", 59));
        students.add(new Student("Student2", 59));
        students.add(new Student("Student3", 59));
        students.add(new Student("Student4", 59));
        students.add(new Student("Student5", 59));
        students.add(new Student("Student6", 59));
        students.add(new Student("Student7", 59));
        students.add(new Student("Student8", 59));
        students.add(new Student("Student9", 59));
        students.add(new Student("Student10", 59));
        students.add(new Student("Student11", 59));


        return students;
    }
}
