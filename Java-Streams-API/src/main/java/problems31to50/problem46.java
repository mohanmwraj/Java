package problems31to50;

import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.Arrays;
import java.util.List;

/*
    Map a list of numbers to their cubes
 */
public class problem46 {
    public static void main(String[] args) {

        List<Integer> nums = Input.getNumbers();

        // Approach 1:
        List<Integer> cubes = nums.stream()
                .map(n -> n * n * n)
                .toList();
        System.out.println(cubes);

        // Approach 2: primitive streams for performances
        int[] cubes1 = nums.stream()
                .mapToInt(n -> n * n * n)
                .toArray();
        System.out.println(Arrays.toString(cubes1));
    }
}
