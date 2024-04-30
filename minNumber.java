package com.list;

import java.util.Comparator;
import java.util.stream.Stream;

public class minNumber {

	public static void main(String[] args) {
		
		Integer min = Stream.of(10,20,30).min(Comparator.comparingInt(Integer::valueOf)).get();
		System.out.println(min);
	}
}
