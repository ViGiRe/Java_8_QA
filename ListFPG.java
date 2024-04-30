package com.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListFPG {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(8, 10, 3, 4, 7, 3, 4);



		List<Integer> list = numbers.stream().distinct().map(x -> (x*x)).collect(Collectors.toList());
		list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
	}

}
