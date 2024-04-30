package com.list;
//Q6) Java 8 program to Count Strings whose length is greater than 3 in List?

import java.util.Arrays;
import java.util.List;

public class CountLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Vishakah","Hello","Hi");
		Long count = list.stream().filter(str -> str.length()>3).count();
		System.out.println(count);
	}
}
