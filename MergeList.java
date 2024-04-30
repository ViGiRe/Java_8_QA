package com.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(5,6,7,8,9,1);
		
		List<Integer> mergeList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(mergeList);
		
		List<Integer> duplicateList = mergeList.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicateList);
	}

}
