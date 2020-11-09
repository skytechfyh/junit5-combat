package com.junit.example;

import com.util.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc 测试testAll
 */
public class TestAssertAll {

	@Test
	public void testAdd(){
		int result = Calculator.add(4, 2);
		int result2 = Calculator.add(5, 4);
		int result3 = Calculator.add(6, 8);

		assertAll("计算结果检验",
				()->assertEquals(6, result),
				()->assertEquals(8, result2),
				()->assertEquals(11, result3)
		);
	}
}
