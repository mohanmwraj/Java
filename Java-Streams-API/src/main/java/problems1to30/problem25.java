package problems1to30;

/*
    Filter a list of strings based on length
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class problem25 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "a", "abcd", "wxyz", "hello"
        );

        // Approach 1:
        List<String> longOnes = words.stream()
                .filter(n -> n.length() > 3)
                .toList();
        System.out.println(longOnes);

        // Approach 2: Collectors.filtering()
        List<String> longOnes1 = words.stream()
                .collect(Collectors.filtering(s -> s.length() > 3,
                        Collectors.toList()));

        System.out.println(longOnes1);

    }
}
