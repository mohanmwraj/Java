package com.JavaStreams.Java_Streams_API.Sorting_Ordering;

import com.JavaStreams.Java_Streams_API.Filtering_Matching.*;
import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortingOrdering {

    public void sortingOrdering(){
        List<Employee> employees = filteringMatching.getEmployees();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Sort Employees by Salary
        List<Employee> sortedEmployeesBySalary = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();

        //Sort Employees by Name
        List<Employee> sortedEmployeesByName = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .toList();

        //sort numbers in reverse order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        //Get Top 3 Highest Paid employees
        List<Employee> highestPaidEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .toList();

        //Get Lowest 2 Salaries
        List<Employee> lowestPaidEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .limit(2)
                .toList();

        //Sort Strings by length
        List<String> strings = Input.getStrings();

        List<String> sortedStrings = strings.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();

        //Sort Employees by Age and then Salary
        List<Employee> sortedEmployee = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary))
                .toList();

        //Get Employees sorted in descending order of name
        List<Employee> sortedEmployeeByName = employees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .toList();

        //Sort Unique Numbers
        List<Integer> numbers1 = Input.getNumbers();
        List<Integer> sortedNumnber = numbers1.stream()
                .sorted()
                .distinct()
                .toList();

        //Find the 2nd Highest Salary
        Float secondHS = employees.stream()
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

    }
}
