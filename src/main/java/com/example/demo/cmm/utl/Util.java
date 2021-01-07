package com.example.demo.cmm.utl;

import java.io.File; 
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.stereotype.Component;


@Component
public class Util {
	public static Consumer<String> print = System.out :: println;

	public static Function<String, Integer> integer = Integer::valueOf;
  
    public static Function<Object,String> string = String::valueOf;
    
    public static BiPredicate<String, String> equals = String::equals;
   
    public static BiFunction<Integer, Integer, Integer> random = (t, u) -> (int)(Math.random() * (u - t)) + t;
     
    public static Function<Integer, int[]> intArr = int[]::new;
   
    public static Supplier<LocalDate> today = () -> LocalDate.now();
    
    public static Supplier<LocalTime> time = () -> LocalTime.now();
	
 
    public static  BiFunction<String, String, File> file = File::new;

    public static  BiFunction<File, String, File> file2 = File::new;
 
    public static  Supplier<List<String>> s = ArrayList::new;

}
