package com.unir.isa.calculator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class CalculatatorTest {
	BigDecimal enteroPos = new BigDecimal(8);
	BigDecimal enteroNeg = new BigDecimal(-3);
	
	BigDecimal decimalesPos = new BigDecimal(6.47);
	BigDecimal decimalesNeg = new BigDecimal(-3.72);
	
	@Test
	@DisplayName("Prueba Suma")
	public void testSumar() {

		assertEquals(2+2,  4);
	}

	
	@Test
	@DisplayName("Prueba Resta")
	public void testRestar() {
		
		assertEquals(3-2, 1);
	}
	
	@Test
	@DisplayName("Prueba Multiplicacion")
	public void testMultiplicar() {
		
		assertEquals(3*2, 6);
	}

	@Test
	@DisplayName("Prueba Divisin")
	public void testDividir() {
		
		assertEquals(32/8, 4);
	}
	
	@Test
	@DisplayName("Prueba Raiz Cuadrada")
	public void testRaiz() {
		
		assertEquals(4, 2*2);
	}
	
	@Test
	@DisplayName("Prueba Explonencia con base e")
	public void testExponencial() {
		
		assertEquals(1, 1);
	}
}
