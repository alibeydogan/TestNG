package com.class01;

import org.testng.annotations.Test;

public class TestNGDemo {
	/*
	 * TestNG is annotaiton based tool/framework
	 * 
	 * The main annotaion is @Test
	 * When we tag method with @Test it means it is an actual
	 * test method
	 * 
	 * We can have multiple test methods in our pgogram. Test
	 * will be executed in alphabetical order (method name)
	 */
	@Test
	public void testOne() {
		System.out.println("Hello");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Hello from test 2");
	}
	
	@Test
	public void testThree() {
		System.out.println("Hello from test 3");
	}
}
