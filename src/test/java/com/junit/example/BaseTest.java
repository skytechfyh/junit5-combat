package com.junit.example;

import com.util.Calculator;
import org.junit.jupiter.api.Test;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc 基本的测试，测试加减乘除
 */
public class BaseTest {

	/**
	 * 测试加法
	 */
	@Test
	public void testAdd(){
		int result = Calculator.add(4, 2);
		System.out.println(result);
	}

	/**
	 * 测试减法
	 */
	@Test
	public void testSubTract(){
		int result = Calculator.subtract(4, 2);
		System.out.println(result);
	}

	/**
	 * 测试乘法
	 */
	@Test
	public void testMultiply(){
		int result = Calculator.multiply(4, 2);
		System.out.println(result);
	}

	/**
	 * 测试除法
	 */
	@Test
	public void testDivide(){
		int result = Calculator.divide(4, 2);
		System.out.println(result);
	}

	/**
	 * 测试累加，因为Calculator是静态的，所以计算结果的值跟期望的值不一样，需要加一个清理的方法，
	 * 清理的方法的执行要在testCount之前，参见TestOrder
	 */
	@Test
	public void testCount() throws InterruptedException {
		int result = Calculator.count(2);
		result = Calculator.count(2);
		result = Calculator.count(2);
		result = Calculator.count(2);
		System.out.println(result);
	}
}
