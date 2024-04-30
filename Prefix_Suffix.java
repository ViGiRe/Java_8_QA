package com.list;
// Java 8 Program to add prefix and suffix to the String?
import java.util.StringJoiner;

public class Prefix_Suffix {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",", "*", "#");
		sj.add("Today");
		sj.add("is");
		sj.add("my");
		sj.add("interview");
		System.out.println(sj);
	}
}
