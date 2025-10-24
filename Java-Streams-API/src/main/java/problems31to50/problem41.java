package problems31to50;

import java.util.Arrays;
import java.util.List;

/*
    Flatten a list of arrays into a single list
 */
public class problem41 {
    public static void main(String[] args) {
        List<int[]> lists = Arrays.asList(
                new int[]{1, 2, 3, 4, 5},
                new int[]{6, 7, 8},
                new int[]{9, 10}
        );



        // Approach 1: Flatmap with Arrays::Streams
        List<Integer> flat = lists.stream()
                .flatMapToInt(Arrays::stream) // Flattens each array into one continuous IntStream
                .boxed() //Converts primitive int to Integer (object type)
                .toList();

        System.out.println(flat);

        // Approach 2: Primitive Arrays
        int[] flat1 = lists.stream()
                .flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println(Arrays.toString(flat1));
    }
}
