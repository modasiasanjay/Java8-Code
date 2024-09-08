package com.java.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Programs1 {

	public static void main(String[] args) {

		
		//Filter 
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,10);
		System.out.println(ls.stream().filter(num -> num > 5).collect(Collectors.toList()));
		
		System.out.println("--------------1------------");
		
		//Sorting
		List<String> str = Arrays.asList("Saurabh", "Manan", "Sanjay", "Piyush", "Jigar", "Jay", "Bitu");
		System.out.println(str.stream().sorted().collect(Collectors.toList()));  //aesc
		System.out.println("-------------2-------------");
		
		System.out.println(str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())); //reverse - desc
		System.out.println("-----------3---------------");
		
		//Sorting the names according to their length
		str.stream().sorted((String st, String st1) -> st.length() - st1.length()).forEach(System.out:: println);
		System.out.println("------------4--------------");
		
		// Traverse data using forEach
		str.stream().forEach(System.out ::println); 
		System.out.println("----------5----------------");
		
		//Check time for Normal vs Parallel stream execution
		//Bellow example there will not be much impact with normal vs parallel stream
		long start = System.currentTimeMillis();
		str.stream().filter(name -> name.length() > 5).sorted().map(String :: toUpperCase).forEach(System.out:: println);
		long end = System.currentTimeMillis();
		System.out.println("Time for normal Execution of stream :: " + (end - start));
		
		System.out.println("------------6--------------");
		
		long start1 = System.currentTimeMillis();
		str.parallelStream().filter(name -> name.length() > 5).sorted().map(String :: toUpperCase).forEach(System.out:: println);
		long end1 = System.currentTimeMillis();
		System.out.println("Time for normal Parallel of stream :: " + (end1 - start1));
		
		System.out.println("------------7--------------");
		
		//****************Short Circuiting Operations*************//
		
		//reduce
		System.out.println(ls.stream().reduce((a,b) -> a + b)); // if no input then Optional.Empty will return
		
		System.out.println(Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).min()); // Return OptionalInt
		System.out.println(Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).max());
		
		System.out.println("------------8--------------");
		//count
		System.out.println(ls.stream().filter(num -> num > 5).count());
		
	}

}
