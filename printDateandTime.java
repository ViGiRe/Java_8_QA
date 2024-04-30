package com.list;
//Q11) Print current date and time in Java 8 Date and Time API?

public class printDateandTime {

	public static void main(String[] args) {
		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalTime.now());
	}
}
