package com.example.demo.www.chap02;

import java.util.function.Consumer;

public class AnnonyTest {
	public static void main(String... args) {
		Person p = new Person();
		System.out.println(p.returnName("홍길동"));
	
	IPerson ip = (String name) -> {return name;};
	
	Log log = (String msg) -> {
		Consumer<String> c = System.out::print;
		c.accept(msg);};
		log.print(ip.showName("김신"));
	}
	
	
	Log i =new Log() {
		
		@Override
		public void print(String msg) {
			// TODO Auto-generated method stub
			
		}
	};
	
	
	
	
	
		// 모던자바(Anonymous) 잘 쓰이지는 않음
//		System.out.println(new IPerson() {
//			
//			@Override
//			public String returnName(String name) {
//				// TODO Auto-generated method stub
//				return name;
//			}
//		}.returnName("이순신"));
//	}

	// 모던 자바 (method reference)
//	new Log() {
//		
//		@Override
//		public void print(String msg) {
//			Consumer<String> c = System.out::print;
//			c.accept(msg);
//			
//		}
//	}.print(new IPerson() {
//		
//		@Override
//		public String returnName(String name) {
//			// TODO Auto-generated method stub
//			return name;
//		}
//	}.returnName("이순신"));
//	
//}
}
class Person{String name; String returnName(String name) {return name;}}
interface IPerson{String showName(String name);}
interface Log{void print(String msg);}