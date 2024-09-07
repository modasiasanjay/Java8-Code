package com.java.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Programs1 {

	public static void main(String[] args) {

		//testing
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
		System.out.println(ls.stream().filter(num -> num > 5).collect(Collectors.toList()));
		
		List<String> str = Arrays.asList("Saurabh", "Manan", "Sanjay");
		System.out.println(str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())); //reverse - desc
		//System.out.println(str.stream().sorted().collect(Collectors.toList()));  //aecs
	}

}
