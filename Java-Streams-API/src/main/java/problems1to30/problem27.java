package problems1to30;

import java.util.List;
import java.util.stream.Collectors;

/*
    Find distinct characters from a string using streams
 */
public class problem27 {
    public static void main(String[] args) {
        String s = "banana";

        //Approach 1: char() -> IntStream, then box to character.
        List<Character> chars = s.chars()
                .mapToObj(c -> (char)c)
                .distinct()
                .toList();
        System.out.println(chars);

        //Approach 2: Collect distinct code points back into a string.
        String unique = s.chars()
                .distinct()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        System.out.println(unique);
    }
}
