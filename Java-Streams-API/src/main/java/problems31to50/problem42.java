package problems31to50;

import com.JavaStreams.Java_Streams_API.Utils.Employee;
import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.*;
import java.util.stream.Collectors;

/*
    Remove duplicates based on a specific field in objects
 */
public class problem42 {
    public static void main(String[] args) {

        List<Employee> employees = Input.getEmployees();

        // Approach 1: toMap keyed by field
        Collection<Employee> unique = employees.stream()
                .collect(Collectors.toMap(
                                Employee::getName, // key: name KeyMapper
                                e -> e,            // value: employee valueMapper
                                (e1, e2) -> e1,    // on duplicate name, keep the first MergeFn
                                LinkedHashMap::new // Map Supplier
                        ))
                .values();
        System.out.println(unique);

        // Approach 2: TreeSet with Comparator on field

        List<Employee> unique2 = employees.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection( () -> new TreeSet<>(Comparator.comparing(Employee::getName))),
                        ArrayList::new
                ));
        System.out.println(unique2);

    }
}
