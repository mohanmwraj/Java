package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/*
    Generate a lost of random numbers using streams
 */
public class problem26 {
    public static void main(String[] args) {

        //Approach 1: Stream.generate supplier + limit
        List<Double> rnd = Stream.generate(Math::random)
                .limit(15)
                .toList();
        System.out.println(rnd);

        //Approach 2: Random.ints to produce intStream
        Random rand = new Random();
        List<Integer> rnd1 = rand.ints(15, 1, 10000)
                .boxed()
                .toList();
        System.out.println(rnd1);
    }
}
