package problems1to30;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
    Find the second largest number in a list
 */
public class problem30 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(21, 45, 12312, 54, 2121, 6, 66, 777, 12);

        //Approach 1: distinct to avoid duplicates, reverse sort, then skip first
        int second = nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(second);

        //Approach 2: Collect to reversed TreeSet (Unique + Ordered), then take the second
        int second_1 = nums.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<Integer>(Comparator.reverseOrder())),
                        set -> set.stream().skip(1).findFirst().orElseThrow(java.util.NoSuchElementException::new)
                ));
        System.out.println(second_1);
    }
}
