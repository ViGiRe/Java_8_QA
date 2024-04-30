package com.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Q9) Java 8 program to perform concatenation on two Streams?

public class concatStrings {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,11,12,13);
		List<Integer> list2 = Arrays.asList(20,21,22,23);

		Stream<Integer> conc = Stream.concat(list1.stream(), list2.stream());
		conc.forEach(System.out::println);
	}
}
