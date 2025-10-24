package problems1to30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
    Skip the first N Elements in a Stream
 */
public class problem20 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Approach 1: skip()

        List<Integer> after2 = nums.stream()
                .skip(2)
                .toList();
        System.out.println(after2);

        //Approach 2: Index based filter as an alternative
        List<Integer> after2_1 = IntStream.range(0, nums.size())
                .filter(i -> i >= 2)
                .mapToObj(nums::get)
                .toList();
        System.out.println(after2_1);

    }
}
