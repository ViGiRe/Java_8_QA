package com.list;
//Q2). Java 8 Program to Print ten random numbers using forEach?

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random r = new Random();
		r.ints().distinct().limit(10).forEach(System.out::println);
		
	}
}
