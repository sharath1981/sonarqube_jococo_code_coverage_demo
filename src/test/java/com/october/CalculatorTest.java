package com.october;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calculator;
	
	@BeforeEach
	public void init() {
		calculator = new Calculator();
	}

	@Test
	final void testAddition() {
		assertEquals(12, calculator.addition(4, 8));
	}

	@Test
	final void testMultiplication() {
		assertEquals(32, calculator.multiplication(4, 8));
	}

	@Test
	final void testSubstraction() {
		assertEquals(0, calculator.substraction(8, 8));
	}

	@Test
	final void testDivision() {
		assertEquals(2, calculator.division(8, 4));
	}

}
