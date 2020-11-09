package com.junit.example;

import com.util.Calculator;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
@Epic("allure 测试")
public class TestAllure {

	/**
	 * 测试加法
	 */
	@Test
//	@DisplayName("测试加法")
	@Description("测试加法")
	@Issue("https://www.baidu.com")
	@Link(name = "社区贴", type = "my link", url = "https://ceshiren.com/t/topic/7611")
	public void testAdd(){
		int result = Calculator.add(4, 2);
		System.out.println(result);
		Allure.addAttachment("pic", "image/jpg", this.getClass().getClassLoader().getResourceAsStream("aa.jpg"), ".jpg");
//		File file = new File("aa.jpg");
//		System.out.println(file);
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

	@BeforeEach
	public void testClean(){
		Calculator.clean();
	}

	/**
	 * 测试累加
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
