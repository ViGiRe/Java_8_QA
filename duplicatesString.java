package com.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

//word occurenece in stream
public class duplicatesString {

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("Hello","Hi","Hello");
		
		//unique value
		 Set<String> uniqueElemets= list.stream()
				    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				 	.entrySet().stream()
	                .map(Map.Entry::getKey)
	                .collect(Collectors.toSet());
		 System.out.println(uniqueElemets);
		 
		
		 Map<String, Long> duplicateCount = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		 duplicateCount.forEach(
	                (key, value) -> System.out.println("Key : " + key + "\t Count : " + value)
	                );
		
		 Set<String> unique= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toSet());
		 System.out.println(unique);
	}
}
