package problems1to30;

import java.util.Arrays;
import java.util.List;

/*
    Find maximum number in a list
 */
public class problem04 {
    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(11, 23, 44, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Approach 1
        int sum = nums.stream()
                .reduce(Integer::max)
                .orElseThrow();

        // reduce with Integer::max avoids converting to primitive stream.
        System.out.println(sum);

        //Approach 2
        int sum1 = nums.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();
        System.out.println(sum1);
    }
}
