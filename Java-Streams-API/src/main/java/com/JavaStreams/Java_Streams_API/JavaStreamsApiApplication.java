package com.JavaStreams.Java_Streams_API;

import com.JavaStreams.Java_Streams_API.Utils.Input;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class JavaStreamsApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaStreamsApiApplication.class, args);
		List<Integer> in = Input.getNumbers().stream().peek(System.out::println).toList();
		//System.out.println(Input.getNumbers().stream().peek(System.out::println).toList());
	}


}
