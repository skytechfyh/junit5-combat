package com.junit.example;

import org.junit.jupiter.api.*;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc fixtures执行流程
 */

public class TestFixtures {

	@BeforeAll
	public static void beforeAll(){
		System.out.println("beforeAll...");
	}

	@AfterAll
	public static void afterAll(){
		System.out.println("afterAll...");
	}

	@BeforeEach
	public void beforeEach(){
		System.out.println("beforeEach...");
	}

	@AfterEach
	public void afterEach(){
		System.out.println("afterEach...");
	}

	@Test
	public void testMethod1(){
		System.out.println("testMethod1...");
	}

	@Test
	public void testMethod2(){
		System.out.println("testMethod2...");
	}

	@Test
	public void testMethod3(){
		System.out.println("testMethod3");
	}
}
