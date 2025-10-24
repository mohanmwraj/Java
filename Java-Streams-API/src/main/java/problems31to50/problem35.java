package problems31to50;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
    Implement Pagination using skip() and limit()
 */
public class problem35 {
    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(1, 2, 43, 5, 12, 34, 675, 54);
        int page = 3;
        int size = 1;

        //Approach 1: Slice a list
        List<Integer> pageData = lists.stream()
                .skip((long)(page - 1) * size)
                .limit(size)
                .toList();
        System.out.println(pageData);

        //Approach 2: using IntStream index slicing
        List<Integer> pageData1 = IntStream.range(0, lists.size())
                .filter(i -> i >= (page - 1) * size && i < page * size)
                .mapToObj(lists::get)
                .toList();
        System.out.println(pageData1);


    }
}
