package problems31to50;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    Create an infinite stream of numbers and limit the output
 */
public class problem45 {
    public static void main(String[] args) {


        // Approach 1: Stream.iterate
        List<Integer> first10 = Stream.iterate(0, n -> n + 1)
                .limit(10)
                .toList();
        System.out.println(first10);

        // Approach 2: primitive Intstream.iterate
        int[] first10_1 = IntStream.iterate(0, n -> n + 1)
                .limit(10)
                .toArray();
        System.out.println(Arrays.toString(first10_1));
    }
}
