package problems1to30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Find Average of list of numbers
 */
public class problem18 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        //Approach 1: IntStream average return Optional double
        double avg = nums.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(avg);

        //Approach 2: Averaging collectors
        double avg1 = nums.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(avg1);
    }
}
