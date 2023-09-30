package com.junit.fixture;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {
	
	int x,y;
	
	@Before
	public void setUp() {
		System.out.println(x+" setup before "+y);
		x=50;y=60;
		System.out.println(x+" setup after "+y);
	}
	
	@Test
	public void test1() {
		System.out.println("these first test case");
		assertEquals((x+y),110);
	}
	
	@Test
	public void test2() {
		System.out.println("these second test case");
		x++;
		assertEquals((x+y),111);
	}

	@Test
	public void addTest() {
		Addition addition=new Addition();
		int add = addition.add(10,20);
		assertEquals(add,30);
	}
	
	@After
	public void tearDown() {
		System.out.println(x+"  tear down before "+y);
		x=0;y=0;
		System.out.println(x+" tear down after "+y);
	}
}
