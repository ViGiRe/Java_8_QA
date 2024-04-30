package com.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sumOfOddNo {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,12,12,17,19,14,3,18);
		Integer sum = list.stream().filter(x -> x%2==1).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
	}

}
