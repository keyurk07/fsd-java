package com.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculatorDiv {

	@Test
	void testDivide() {
		
		Calculator calc = new Calculator();
		int expected = 10/20;
		double actual = calc.divide(10, 20);
		boolean result = (actual == expected);
		assertTrue(result);
		
	}

}
