package com.list;
//Q14) Java 8 program to perfrom cube on list elements and filter numbers greater than 50.

import java.util.Arrays;
import java.util.List;

public class cube {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,6);
		list.stream().map(x -> x*x*x).filter(x-> x>50).forEach(System.out::println);
	}

}
