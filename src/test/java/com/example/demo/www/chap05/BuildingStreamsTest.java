package com.example.demo.www.chap05;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;
import static java.util.Arrays.asList;
class BuildingStreamsTest {
	BuildingStreamsService bs = new BuildingStreamsService();

	@Test
	void testMyOf() {
		assertTrue(asList("Java 8", "Lambdas", "In", "Action").equals(bs.myof()));
	}

	@Test
	void testMySum() {
		assertEquals(41, bs.mySum());
	}

	@Test
	void testMyIterator() {
		assertTrue(asList().equals(bs.myIterator()));
	}

	@Test
	void testMyFinonacci() {
		assertTrue(asList().equals(bs.myFinonacci()));
	}

	@Test
	void testMyFinonacci2() {
		assertTrue(asList().equals(bs.myFinonacci2()));
	}

}
