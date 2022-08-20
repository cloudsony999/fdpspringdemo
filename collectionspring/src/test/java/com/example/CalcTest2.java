package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalcTest2 {

	static int x, y;

	@BeforeAll
	public static void init() {
		System.out.println("in init");
		x = y = 50;
	}

	@BeforeEach
	public void b() {
		System.out.println("I am before all tests");
	}

	@Test
	void testSum() {
		assertEquals("testing1", 100, new Calc().sum(x, y));
	}

	@Test
	void testSub() {
		assertEquals("testing2", 0, new Calc().sub(x, y));
	}

	@AfterEach
	public void a() {
		System.out.println("I am after all tests");
	}

	@AfterAll
	public static void reset() {
		System.out.println("in reset");
		x = y = 0;
	}

	// not needed
	@Disabled("not needed")
	public void dont_test_me() {
		System.out.println("......");
	}

	// multiple times
	@RepeatedTest(value = 10)
	void demo() {
		System.out.println("I am Amitava");
	}

}
