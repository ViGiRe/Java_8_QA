package com.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class reverseOrder {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello","Hi","Vishakha");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
