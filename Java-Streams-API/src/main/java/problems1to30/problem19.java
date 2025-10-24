package problems1to30;

import com.JavaStreams.Java_Streams_API.Utils.Employee;
import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
    Convert a list of objects t0 a list of one of their fields
 */
public class problem19 {
    public static void main(String[] args) {
        List<Employee> employees = Input.getEmployees();

        //Approach 1:
        List<String> names = employees.stream()
                .map(Employee::getName)
                .toList();

        System.out.println(names);

        //Approach 2:
        Set<String> names1 = employees.stream()
                .collect(Collectors.mapping(Employee::getName,
                        Collectors.toSet()));
        System.out.println(names1);

    }
}
