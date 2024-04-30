package com.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class wordOccurence {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,12,12,1);
		list.stream().collect(Collectors.toSet()).forEach(System.out::println);
	}
}
