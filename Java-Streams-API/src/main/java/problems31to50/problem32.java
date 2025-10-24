package problems31to50;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    Count the frequency of each element.
 */
public class problem32 {
    public static void main(String[] args) {
        List<String> items = List.of("a", "b", "c", "d", "b", "a");

        // Approach 1: groupingBy + Counting
        Map<String, Long> freq = items.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(freq);

        //Approach 2: toMap with merge function
        Map<String, Integer> freq1 = items.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        v -> 1,
                        Integer::sum
                ));
        System.out.println(freq1);
    }
}
