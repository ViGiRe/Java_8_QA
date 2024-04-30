package com.list;

import java.util.Arrays;
import java.util.List;

//Q3). Java 8 program to iterate a Stream using the forEach method?

public class IterateStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,13,14,19,15);
		list.stream().forEach(System.out::println);
	}
}
