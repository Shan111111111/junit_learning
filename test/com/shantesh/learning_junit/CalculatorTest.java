package com.shantesh.learning_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void nowTestingThisone() {
		Calculator calculator = new Calculator();
		int result = calculator.add(new int[] {1,2,4,3});
		assertEquals(10, result, "assert Failed Uffff");
		
	}

	@Test
	void testingSameMethodButallinputCreationandcallinginOneLine() {
		assertEquals(10, new Calculator().add(new int[] {1,2,4,3}), "assert Failed Uffff");
		
	}

}
