package com.list;
//Q8) Java 8 program to multiply 3 to all elements in the list and print the list?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyElements {
	
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(2,3,4);
		list.stream().map(x -> x*3).collect(Collectors.toList()).forEach(System.out::println);
	}

}
