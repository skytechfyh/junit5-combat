package com.junit.example;

import com.util.Calculator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrder {

	/**
	 * 测试加法
	 */
	@Test
	@Order(1)
	public void testAdd(){
		int result = Calculator.add(4, 2);
		System.out.println(result);
	}

	/**
	 * 测试减法
	 */
	@Test
	@Order(2)
	public void testSubTract(){
		int result = Calculator.subtract(4, 2);
		System.out.println(result);
	}

	/**
	 * 测试乘法
	 */
	@Test
	@Order(3)
	public void testMultiply(){
		int result = Calculator.multiply(4, 2);
		System.out.println(result);
	}

	/**
	 * 测试除法
	 */
	@Test
	@Order(4)
	public void testDivide(){
		int result = Calculator.divide(4, 2);
		System.out.println(result);
	}

	@Test
	@Order(5)
	public void testClean(){
		Calculator.clean();
	}

	/**
	 * 测试累加
	 */
	@Test
	@Order(6)
	public void testCount() throws InterruptedException {
		int result = Calculator.count(2);
		result = Calculator.count(2);
		result = Calculator.count(2);
		result = Calculator.count(2);
		System.out.println(result);
	}
}
