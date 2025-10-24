package problems31to50;

import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/*
    Reverse a list using strings
 */
public class problem44 {
    public static void main(String[] args) {

        List<Integer> nums = Input.getNumbers();

        // Approach 1: index based mapping
        List<Integer> reversed = IntStream.range(0, nums.size())
                .mapToObj(i -> nums.get(nums.size() - 1 - i))
                .toList();
        System.out.println(reversed);

        // Approach 2: non-stream Collections.reverse() recommended for mutability

        List<Integer> copy = new ArrayList<>(nums);
        Collections.reverse(copy);
        System.out.println(copy);

        // For in-place reversal collections.reverse is simpler and faster.
    }
}
