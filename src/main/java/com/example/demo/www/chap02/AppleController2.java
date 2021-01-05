package com.example.demo.www.chap02;



import java.util.ArrayList;  
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Stream;
import  static java.util.stream.Collectors.toList;

import static java.util.Comparator.comparing;
import static com.example.demo.cmm.utl.Util.*;

import lombok.Data;

public class AppleController2  {
	public static void main(String... args) {
	
	//Predicate<Apple> p =  (Apple apple) -> {return false;};
	
	List<Apple> ls = Arrays.asList(
			new Apple[] {
			new Apple(80,Color.GREEN),
			new Apple(100,Color.GREEN),
			new Apple(120,Color.RED)});

	// 명령형

			ls.stream()
	.map(Apple::toString).limit(3).
	collect(toList()).forEach(System.out::println);
	
	System.out.println();
	// 선언형
//	Stream<String> a = ls.stream();
//	s.forEach(System.out::print);



}

}






