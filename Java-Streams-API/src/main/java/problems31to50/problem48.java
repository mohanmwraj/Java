package problems31to50;

import com.JavaStreams.Java_Streams_API.Utils.Employee;
import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
    Filter employees earning more that a certain salary
 */
public class problem48 {
    public static void main(String[] args) {

        List<Employee> employees = Input.getEmployees();

        // Approach 1: Simple Filter
        float threshold = 123;
        List<Employee> rich = employees.stream()
                .filter(e -> e.getSalary() > threshold)
                .toList();
        System.out.println(rich);

        // Approach 2: Collectors.filtering Java 9+
        List<Employee> rich1 = employees.stream()
                .collect(Collectors.filtering(
                        e -> e.getSalary() > threshold,
                        Collectors.toList()
                ));
        System.out.println(rich1);
    }
}
