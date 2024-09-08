package com.java.program;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


public class StreamVsParallelStream {
    public static void main(String[] args) {
    	
        List numbers = new ArrayList<>();
        System.out.println("Start Adding Numbers.....");
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        
        System.out.println(numbers);
        
        List numbers1 = new ArrayList<>();
        System.out.println("Start Adding Numbers.....");
        for (int i = 0; i < 10; i++) {
            numbers1.add(i);
        }
        
        System.out.println(numbers1);
        
        System.out.println("..............................Numbers are added..............");
        List numbersSync = new ArrayList();
        List numbersAsync = new ArrayList();


        System.out.println("Start Sync.....");
        Instant startSync = Instant.now();
        numbers.stream()
                .forEach(n -> {
                    numbersSync.add(n);
                });
        Instant stopSync = Instant.now();
        System.out.println("Sync: " + Duration.between(startSync, stopSync));
        System.out.println(numbersSync);


        System.out.println("Start Async.....");
        Instant startAsync = Instant.now();
        numbers1.parallelStream()
                .forEach(n -> {
                	synchronized (startAsync) {
                		numbersAsync.add(n);
						
					}
                });
        Instant stopAsync = Instant.now();
        System.out.println("Async: " + Duration.between(startAsync, stopAsync));
        System.out.println(numbersAsync);
    }
}
