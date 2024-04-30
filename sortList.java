package com.list;

import java.util.Arrays;
import java.util.List;

public class sortList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,45,1,13,14,15,16,78,89,90);
		
		list.stream().sorted().forEach(System.out::println);
	}
}
