package problems31to50;

/*
    find the oldest person in a list of people
 */

import com.JavaStreams.Java_Streams_API.Utils.Employee;
import com.JavaStreams.Java_Streams_API.Utils.Input;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class problem49 {
    public static void main(String[] args) {

        List<Employee> employees = Input.getEmployees();

        // Approach 1:
        Optional<Employee> oldest = employees.stream()
                .max(Comparator.comparing(Employee::getAge));
        System.out.println(oldest.get().getName());

        // Approach 2:
        Optional<Employee> oldest1 = employees.stream()
                .reduce((e1, e2) -> e1.getAge() >= e2.getAge() ? e1 : e2);
        System.out.println(oldest1.get().getName());
    }
}
