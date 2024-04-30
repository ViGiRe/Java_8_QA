package com.list;
//Q7). Java 8 program to Print Strings whose length is greater than 3 in List.

import java.util.Arrays;
import java.util.List;

//Q6) Java 8 program to Count Strings whose length is greater than 3 in List?

public class Length {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello","Sir");
		list.stream().filter(str -> str.length()>3).forEach(System.out::println);
	}
}
