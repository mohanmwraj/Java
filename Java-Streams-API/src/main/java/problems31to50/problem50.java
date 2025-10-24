package problems31to50;

import com.JavaStreams.Java_Streams_API.Utils.Employee;
import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
    Find the youngest person in a list of people
 */
public class problem50 {
    public static void main(String[] args) {


        List<Employee> employees = Input.getEmployees();

        // Approach 1:
        Optional<Employee> youngest = employees.stream()
                .max(Comparator.comparing(Employee::getAge));
        System.out.println(youngest.get().getName());

        // Approach 2:
        Optional<Employee> youngest2 = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .findFirst();
        System.out.println(youngest2.get().getName());
    }
}
