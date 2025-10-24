package problems1to30;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/*
    Sort list in ascending order
 */
public class problem08 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 1, 4, 2, 4, 3);

        //Approach 1
        List<Integer> sorted = nums.stream().sorted().toList();
        System.out.println(sorted);

        //Approach 2
        List<Integer> sorted1 = nums.stream()
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println(sorted1);
    }
}
