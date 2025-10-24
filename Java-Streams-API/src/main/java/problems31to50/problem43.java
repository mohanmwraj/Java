package problems31to50;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
    Count words in a string using streams
 */
public class problem43 {
    public static void main(String[] args) {

        String text = "Hello world, Good Morning";

        // Approach 1:
        Map<String, Long> counts = Arrays.stream(text.split("\\s+")) // split wherever there is one or more whitespace characters.
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(counts);

        // Approach 2: regex Matcher.results() unicode aware Java 9+
        Pattern p = Pattern.compile("\\p{L}+"); // Any letter (uppercase, lowercase, titlecase, modifier, other letters). One or more letter
        Map<String, Long> counts2 = p.matcher(text).results()
                .map(m -> m.group().toLowerCase())
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(counts2);
    }
}
