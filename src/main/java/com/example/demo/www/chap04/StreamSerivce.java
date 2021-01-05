package com.example.demo.www.chap04;

   
import static java.util.Comparator.comparing; 
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.example.demo.cmm.utl.Util;

import lombok.AllArgsConstructor;
import lombok.Data;
import  static java.util.stream.Collectors.toList;

//		List<String> names = Arrays.asList("Java8", "Lambdas", "In", "Action");
//		names.stream().map(String::toString).limit(4).
//		collect(toList()).forEach(System.out::println);
				
//class Test{
//	public static void main(String[] args) {
//		StreamSerivceTest s =new StreamSerivceTest();
//		s.booktitle().forEach(System.out::print);
//	}
//}

 class StreamSerivce{
	
	public List<String> bookTitle(){
		return Arrays.asList("Java8", "Lambdas", "In", "Action");
	}
public List<Dish> menu(){
	return  Arrays.asList(
			new Dish("pork", false, 800, Type.MEAT),
		      new Dish("beef", false, 700, Type.MEAT),
		      new Dish("chicken", false, 400, Type.MEAT),
		      new Dish("french fries", true, 530, Type.OTHER),
		      new Dish("rice", true, 350, Type.OTHER),
		      new Dish("season fruit", true, 120, Type.OTHER),
		      new Dish("pizza", true, 550, Type.OTHER),
		      new Dish("prawns", false, 400, Type.FISH),
		      new Dish("salmon", false, 450, Type.FISH));
}
	
	

	public List<Dish> filterByWeight(int weight) {
	   return menu().stream()
	        .filter(dish -> {
	          return dish.getCalories() > weight;
	        })
	        .map(dish -> {
	          return dish;
	        })
	        .limit(3)
	        .collect(toList());
	    
	  }
	 public List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes) {
		    List<Dish> lowCaloricDishes = new ArrayList<>();
		    for (Dish d : dishes) {
		      if (d.getCalories() < 400) {
		        lowCaloricDishes.add(d);
		      }
		    }
		    List<String> lowCaloricDishesName = new ArrayList<>();
		    Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
		      @Override
		      public int compare(Dish d1, Dish d2) {
		        return Integer.compare(d1.getCalories(), d2.getCalories());
		      }
		    });
		    for (Dish d : lowCaloricDishes) {
		      lowCaloricDishesName.add(d.getName());
		    }
		    return lowCaloricDishesName;
		  }

		  public  List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
		    return dishes.stream()
		        .filter(d -> d.getCalories() < 400)
		        .sorted(comparing(Dish::getCalories))
		        .map(Dish::getName)
		        .collect(toList());
		  }
}
@Data @AllArgsConstructor class Dish {
  private final String name; boolean vegetarian; int calories;Type type;
		 
}
 enum Type{MEAT , FISH, OTHER}