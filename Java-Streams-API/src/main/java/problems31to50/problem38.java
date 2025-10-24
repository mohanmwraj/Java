package problems31to50;

import com.JavaStreams.Java_Streams_API.Utils.Employee;
import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
    Find the second-highest salary from the list of employees
 */
public class problem38 {
    public static void main(String[] args) {
        List<Employee> employees = Input.getEmployees();

        // Approach 1: map, distinct, sort desc
        Optional<Float> second = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(second.get());

        // Approach 2: TreeSet
        TreeSet<Float> set = employees.stream()
                .map(Employee::getSalary)
                .collect(Collectors.toCollection(() -> new TreeSet<Float>(Comparator.reverseOrder())));
        Float second2 = set.stream().skip(1).findFirst().orElse(null);
        System.out.println(second2);



    }
}
