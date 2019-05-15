package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.Calculations;

public class CalculationsTest {
	
	Calculations calc = new Calculations();

	@Test
	public void testAdd() {
		//fail("Not yet implemented"); // TODO
		assertEquals(48, calc.add(25, 25));
	}
	
	// Test case for double value.

	@Test
	public void testSquare() {
		//fail("Not yet implemented"); // TODO
		assertEquals(100, calc.square(10));
	}

}
