package problems31to50;

import com.JavaStreams.Java_Streams_API.Utils.Employee;
import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.Comparator;
import java.util.List;

/*
    Sort a list of objects by a field
 */
public class problem36 {
    public static void main(String[] args) {

        List<Employee> employees = Input.getEmployees();

        // Approach 1: Comparator.comparing()
        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .toList();
        System.out.println(sorted);

        // Approach 2: Lambda Comparator
        List<Employee> sorted2 = employees.stream()
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .toList();
        System.out.println(sorted2);

    }
}
