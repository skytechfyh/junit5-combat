package com.junit.example;

import org.junit.jupiter.api.*;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc 测试fixture的继承执行流程
 */

public class TestFixturesExtend extends TestFixtures {

	@BeforeAll
	public static void beforeChildAll(){
		System.out.println("Child beforeAll...");
	}

	@AfterAll
	public static void afterChildAll(){
		System.out.println("Child afterAll...");
	}

	@BeforeEach
	public void beforeChildEach(){
		System.out.println("Child beforeEach...");
	}

	@AfterEach
	public void afterChildEach(){
		System.out.println("Child afterEach...");
	}

	@Test
	public void testChildMethod1(){
		System.out.println("Child testMethod1...");
	}

	@Test
	public void testChildMethod2(){
		System.out.println("Child testMethod2...");
	}

	@Test
	public void testChildMethod3(){
		System.out.println("Child testMethod3");
	}
}
