package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalcTest {

	static int x, y;

	@BeforeClass
	public static void init() {
		System.out.println("in init");
		x = y = 50;
	}

	@Before
	public void b() {
		System.out.println("I am before all tests");
	}

	@Test
	public void testSum() {
		assertEquals("testing1", 100, new Calc().sum(x, y));
	}

	@Test
	public void testSub() {
		assertEquals("testing2", 0, new Calc().sub(x, y));
	}

	@After
	public void a() {
		System.out.println("I am after all tests");
	}

	@AfterClass
	public static void reset() {
		System.out.println("in reset");
		x = y = 0;
	}

	@Ignore("not required")
	public void dont_test_me() {
		System.out.println("......");
	}

}
