package problems31to50;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
    Get the frequency of each word from a paragraph
 */
public class problem47 {
    public static void main(String[] args) {

        String para = "Hello Good Afternoon";

        // Approach 1: Split + grouping
        Map<String, Long> freq = Arrays.stream(para.toLowerCase().split("\\W+")) // matches one or more characters that are not letters, digits, or underscore.
                .filter(s -> !s.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        System.out.println(freq);

        // Approach 2: regex tokenization with pattern
        Pattern p = Pattern.compile("\\p{L}+");
        Map<String, Long> freq2 = p.matcher(para).results()
                .map(m -> m.group().toLowerCase())
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(freq2);
    }
}
