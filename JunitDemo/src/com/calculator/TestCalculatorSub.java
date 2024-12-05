package com.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculatorSub {

	@Test
	void testSub() {
		
		Calculator calc = new Calculator();
		int expected = 20-10;
		int actual = calc.sub(20, 10);
		boolean result = (actual == expected);
		assertTrue(result);
		
	}

}
