package com.example.demo.www.chap05;

import java.nio.charset.Charset; 
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class BuildingStreamsService {
	public List<String> myof(){
		 return Stream.of("Java 8", "Lambdas", "In", "Action").map(String::toUpperCase).collect(Collectors.toList());
	}

	public int mySum(){
		return   Arrays.stream(new int[] { 2, 3, 5, 7, 11, 13 }).sum();
	}
	public List<Integer> myIterator(){
		return Stream.iterate(0, n -> n + 2)
        .limit(10).collect(Collectors.toList());

	}
	public List<Integer[]> myFinonacci(){
		return Stream.iterate(new Integer[] { 0, 1 }, t -> new Integer[] { t[1], t[0] + t[1] })
        .limit(10).collect(Collectors.toList());
        
	}
	public List<Integer> myFinonacci2() {
		return Stream.iterate(new Integer[] { 0, 1 }, t -> new Integer[] { t[1], t[0] + t[1] })
        .limit(10)
        .map(t -> t[0]).collect(Collectors.toList());
	}
//	public int fileTest() {
//		  long uniqueWords = Files.lines(Paths.get("lambdasinaction/chap5/data.txt"), Charset.defaultCharset())
//			        .flatMap(line -> Arrays.stream(line.split(" ")))
//			        .distinct()
//			        .count();
//	}
//	
}
