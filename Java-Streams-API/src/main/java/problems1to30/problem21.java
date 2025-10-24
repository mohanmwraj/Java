package problems1to30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
    Limit a stream to the first N numbers
 */
public class problem21 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

        //Approach 1: limit(n) short circuit after n elements
        List<Integer> first3 = nums.stream()
                .limit(3)
                .toList();
        System.out.println(first3);

        //Approach 2: Index Slicing alternative
        List<Integer> first3_1 = IntStream.range(0, Math.min(3, nums.size()))
                .mapToObj(nums::get)
                .toList();
        System.out.println(first3_1);

    }
}
