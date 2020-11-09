package com.junit.example;

import com.util.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc 测试断言
 */
public class TestAssert {

	/**
	 * 测试加法
	 */
	@Test
	public void testAdd(){
		int result = Calculator.add(4, 2);
		assertEquals(6, result);
	}

	/**
	 * 测试减法
	 */
	@Test
	public void testSubTract(){
		int result = Calculator.subtract(4, 2);
		assertEquals(2, result);
	}

	/**
	 * 测试乘法
	 */
	@Test
	public void testMultiply(){
		int result = Calculator.multiply(4, 2);
		assertEquals(8, result);
	}

	/**
	 * 测试除法
	 */
	@Test
	public void testDivide(){
		int result = Calculator.divide(4, 2);
		assertEquals(2, result);
	}

	/**
	 * 测试累加,因为
	 */
	@Test
	public void testCount() throws InterruptedException {
		int result = Calculator.count(2);
		result = Calculator.count(2);
		result = Calculator.count(2);
		result = Calculator.count(2);
		assertEquals(8, result);
	}
}
