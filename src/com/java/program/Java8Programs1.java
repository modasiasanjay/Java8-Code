package com.java.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Programs1 {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
		System.out.println(ls.stream().filter(num -> num > 5).collect(Collectors.toList()));
	}

}
