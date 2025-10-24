package problems1to30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Remove Empty String in a list
 */
public class problem29 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a", "", "b", "", "c");

        //Approach 1:
        List<String> nonEmpty = words.stream()
                .filter(s -> !s.isEmpty())
                .toList();
        System.out.println(nonEmpty);

        //Approach 2: Trim first, then remove blanks Java 11 String::isBlank
        List<String> trimmedNonBlank = words.stream()
                .map(String::trim)
                .filter(s -> !s.isBlank())
                .toList();
        System.out.println(trimmedNonBlank);
    }
}
