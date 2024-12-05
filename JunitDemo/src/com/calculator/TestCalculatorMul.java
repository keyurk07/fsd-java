package com.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculatorMul {

	@Test
	void testMultiply() {
		
		Calculator calc = new Calculator();
		int expected = 10*20;
		int actual = calc.multiply(10, 20);
		boolean result = (actual == expected);
		assertTrue(result);
		
	}

}
