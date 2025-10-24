package problems31to50;

import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/*
    Find the top N elements from a list
 */
public class problem39 {
    public static void main(String[] args) {
        List<Integer> nums = Input.getNumbers();
        int N = 5;
        // Approach 1: sort and limit:
        List<Integer> topN = nums.stream()
                .sorted(Comparator.reverseOrder())
                .limit(N)
                .toList();
        System.out.println(topN);

        // Approach 2: maintain a min-heap Efficient for large streams.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        nums.forEach(x -> {
            pq.offer(x);
            if(pq.size() > N) pq.poll();
        });

        List<Integer> topN1 = pq.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(topN1);



    }
}
