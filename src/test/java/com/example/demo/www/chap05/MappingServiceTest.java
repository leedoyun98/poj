package com.example.demo.www.chap05;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MappingServiceTest {
	MappingService b = new MappingService();
	@Test
	void testMyMap() {
		assertTrue(asList("pork", "beef", "chicken", "french fries", "rice", "season fruit", "pizza", "prawns", "salmon").equals(b.myMap()));
	}

	@Test
	void testMyMap2() {
		assertTrue(asList(5,5).equals(b.myMap2()));
	}

	@Test
	void testMyFlatMap() {
		assertTrue(asList("H", "e", "l","o", "W", "r", "d").equals(b.myFlatMap()));
	}

	@Test
	void testMyFlatMap2() {
		fail("Not yet implemented");
	}

}
