package problems31to50;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/*
    Merge Two lists using stream
 */
public class problem40 {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> b = Arrays.asList(6, 7, 8, 9, 10);

        // Approach 1:
        List<Integer> merged = Stream.concat(a.stream(),
                b.stream())
                .toList();
        System.out.println(merged);

        // Approach 2:
        List<Integer> merged1 = Stream.of(a, b)
                .flatMap(Collection::stream)
                .toList();
        System.out.println(merged1);


    }
}
