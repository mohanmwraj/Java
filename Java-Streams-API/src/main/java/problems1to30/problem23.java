package problems1to30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Sum a list of numbers
 */
public class problem23 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Approach 1: IntSream

        int sum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        //Approach 2: summingInt Collector
        int sum1 = nums.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum1);
    }
}
