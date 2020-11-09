package com.junit.example;

import com.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
public class TestMixParallel {

	@RepeatedTest(10)
	public void testAdd(){
		int result = Calculator.add(4, 2);
		assertEquals(6, result);
	}

	@RepeatedTest(10)
	public void testSubTract(){
		int result = Calculator.subtract(6, 4);
		assertEquals(2, result);
	}
}
