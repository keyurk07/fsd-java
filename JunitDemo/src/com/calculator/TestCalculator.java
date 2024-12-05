package com.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {

	@Test
	void firstAdd() {		
		
		Calculator calc = new Calculator();
		int expected = 10+20;
		int actual = calc.add(10, 20);
		
//		assertEquals(expected, actual);
		boolean result = (actual == expected);
		assertTrue(result);
		
	}

}
