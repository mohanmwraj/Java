package problems31to50;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
    Find the shortest string in a list
 */
public class problem34 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "Hello",
                "world",
                "Good Morning"
        );

        //Approach 1: min with comparator
        Optional<String> shortest = strings.stream()
                .min(Comparator.comparingInt(String::length));
        System.out.println(shortest.get());

        //Approach 2: sort and take first
        Optional<String> shortest1 = strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .findFirst();
        System.out.println(shortest1.get());
    }
}
