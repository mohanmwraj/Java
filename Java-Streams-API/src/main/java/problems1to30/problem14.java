package problems1to30;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/*
    Filter null values from a list
 */
public class problem14 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", null, "b", null, "c");

        // Approach 1
        List<String> nonNull = list.stream()
                .filter(Objects::nonNull)
                .toList();
        System.out.println(nonNull);

        // Approach 2
        List<String> nonNull1 = list.stream()
                .flatMap(
                        s -> s == null ? Stream.empty() : Stream.of(s)
                ).toList();
        System.out.println(nonNull1);
    }
}
