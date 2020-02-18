package com.class01;

import org.testng.annotations.*;

public class Task2 {
	
	@BeforeClass
	public void beforeClass() {                  //1
		System.out.println("Before Class inside");
	}
	
	@AfterClass
	public void afterClass() {                   //1
		System.out.println("After Class inside");
	}
	
	@BeforeMethod
	public void beforeMethod() {                  //1
		System.out.println("Before Method inside");
	}
	
	@AfterMethod
	public void afterMethod() {                   //1
		System.out.println("After Method inside");
	}
	
	@Test
	public void testA1() {                        //1
		System.out.println("Test 1- A1 inside");
	}
	
	@Test
	public void testZ9() {                         //1
		System.out.println("Test 2- Z9 inside");
	}

}
