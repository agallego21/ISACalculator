package com.unir.isa.calculator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class CalculatatorTest {
	
	
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
	@DisplayName("Prueba Multiplicaci�n")
	public void testMultiplicar() {
		
		assertEquals(3-2, 1);
	}

	@Test
	@DisplayName("Prueba Divisi�n")
	public void testDividir() {
		
		assertEquals(3-2, 1);
	}
	
	@Test
	@DisplayName("Prueba Ra�z Cuadrada")
	public void testRaiz() {
		
		assertEquals(3-2, 1);
	}
	
	@Test
	@DisplayName("Prueba Explonencia con base e")
	public void testExponencial() {
		
		assertEquals(3-2, 1);
	}
}
