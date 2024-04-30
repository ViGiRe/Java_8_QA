package com.list;
//Q5). Java 8 program to find the Maximum number of a Stream?

import java.util.Comparator;
import java.util.stream.Stream;

public class maxNumber {
	
	public static void main(String[] args) {
		
		Integer max = Stream.of(23,24,27).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);

	}

}
