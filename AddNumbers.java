package com.list;
//Q13). Write a Java 8 program to get the sum of all numbers present in a list?

import java.util.Arrays;
import java.util.List;

public class AddNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		System.out.println(list.stream().mapToInt(Integer::intValue).sum());
	}
}
