package problems31to50;

import com.JavaStreams.Java_Streams_API.Utils.Employee;
import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.Comparator;
import java.util.List;

/*
    Sort a list of objects by multiple fields
 */
public class problem37 {
    public static void main(String[] args) {
        List<Employee> employeeList = Input.getEmployees();

        // Approach 1: thenComparing
        List<Employee> sortedEmployees = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Employee::getName))
                .toList();
        System.out.println(sortedEmployees);


        // Approach 2: Combined Lambda Comparator
        List<Employee> sortedEmployees1 = employeeList.stream()
                .sorted((a, b) -> {
                    int r = a.getDepartment().compareTo(b.getDepartment());
                    return r != 0 ? r : a.getName().compareTo(b.getName());
                })
                .toList();
        System.out.println(sortedEmployees1);

    }
}
