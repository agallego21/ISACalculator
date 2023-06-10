package com.unir.isa.calculator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.unir.isa.calculator.Calculator;

public class CalculatatorTest {
	/*BigDecimal enteroPos = new BigDecimal(8);
	BigDecimal enteroNeg = new BigDecimal(-3);

	BigDecimal decimalesPos = new BigDecimal(6.47);
	BigDecimal decimalesNeg = new BigDecimal(-3.72);*/


	// ********** SUMA ***********
	@Test
	@DisplayName("Prueba suma enteros positivos")
	public void testSumarEnterosPos() {
		assertEquals(Calculator.suma(2,2),  4);
	}

	@Test
	@DisplayName("Prueba suma decimales positivos")
	public void testSumarDecimalesPos() {
		assertEquals(Calculator.suma(6.47, 3.72),  10.19);
	}

	@Test
	@DisplayName("Prueba suma enteros negativos")
	public void testSumarEnterosNeg() {
		assertEquals(Calculator.suma((-2),(-2)),  -4);
	}

	@Test
	@DisplayName("Prueba suma decimales negativos")
	public void testSumarDecimalesNeg() {
		assertEquals(Calculator.suma((-6.47),(-3.72)),  -10.19);
	}

	@Test
	@DisplayName("Prueba suma entero positivo y negativo")
	public void testSumarEnterosPosNeg() {
		assertEquals(Calculator.suma(2,(-2)),  0);
	}

	@Test
	@DisplayName("Propiedad conmutiva suma")
	public void testSumarConmutativa() {
		assertEquals(Calculator.suma(2,2),  2+2);
	}

	//******* RESTA ********
	@Test
	@DisplayName("Prueba resta enteros positivos")
	public void testRestarEnterosPos() {
		assertEquals(Calculator.resta(2,2),  0);
	
	}

	@Test
	@DisplayName("Prueba resta decimales positivos")
	public void testRestarDecimalesPos() {
		assertEquals(Calculator.resta(6.47, 3.72),  2.75);
	}

	@Test
	@DisplayName("Prueba resta enteros negativos")
	public void testRestarEnterosNeg() {
		assertEquals(Calculator.resta((-2),(-2)),  0);
	}

	@Test
	@DisplayName("Prueba resta decimales negativos")
	public void testRestarDecimalesNeg() {
		assertEquals(Calculator.resta((-6.47),(-3.72)),  -2.75);
	}

	@Test
	@DisplayName("Restar un número positivo a un número positivo menor")
	public void testRestarEnterosPosPosMen() {
		assertEquals(Calculator.resta(3, 2),  1);
	}

	@Test
	@DisplayName("Restar un número positivo a un número negativo")
	public void testRestarEnterosPosNeg() {
		assertEquals(Calculator.resta(3, -2),  5);
	}

	@Test
	@DisplayName("Restar un número negativo a un número positivo")
	public void testRestarEnterosNegPos() {
		assertEquals(Calculator.resta(-3, 2),  -5);
	}


	// ********** MULTIPLICACION ***********

	@Test
	@DisplayName("Prueba multiplicacion enteros positivos")
	public void testMultiplicarEnterosPos() {
		assertEquals(Calculator.multiplicacion(2,2),  4);
	}

	@Test
	@DisplayName("Prueba multiplicacion decimales positivos")
	public void testMultiplicarDecimalesPos() {
		assertEquals(Calculator.multiplicacion(6.47, 3.72),  24.0764);
	}

	@Test
	@DisplayName("Prueba multiplicacion enteros negativos")
	public void testMultiplicarEnterosNeg() {
		assertEquals(Calculator.multiplicacion((-2),(-2)),  4);
	}

	@Test
	@DisplayName("Multiplicar un número entero positivo y un número entero negativo")
	public void testMultiplicarEnterosPosNeg() {
		assertEquals(Calculator.multiplicacion(2,(-2)),  -4);
	}
	@Test
	@DisplayName("Propiedad conmutativa multiplicacion")
	public void testMultiplicarConmutativa() {
		assertEquals(Calculator.multiplicacion(2, 2),  Calculator.multiplicacion(2, 2));
	}

	// ********** DIVISION ***********

	@Test
	@DisplayName("Dividir dos números enteros con resto 0")
	public void testDividirEnterosPos() {

		assertEquals(Calculator.division(4, 2),  2);
	}

	@Test
	@DisplayName("Dividir dos números enteros con resto distinto de 0")
	public void testDividirEnterosPosDis() {
		assertEquals(Calculator.division(5, 2),  2);
	}

	@Test
	@DisplayName("Comprobar resultado dividendo (cociente * divisor + resto = dividendo)")
	public void testComprobarDiv() {

		assertEquals(Calculator.compruebaMDivision(5, 3, 0),  15);
	}

	// ********** RAIZ CUADRADA *********** REVISAR
	@Test
	@DisplayName("Raíz cuadrada exacta de un número positivo")
	public void testRaizCuadrada() {
		assertEquals(Calculator.calcularRaizCuadrada(2),  4); // a**2 = b
	}

	@Test
	@DisplayName("Raíz cuadrada inexacta de un número positivo")
	public void testRaizCuadradaIne() {
		assertEquals(Calculator.calcularRaizCuadrada(3),  1,732050808);
	}

	@Test
	@DisplayName("Comprobar resultado raiz cuadrada (raiz cuadrada * raiz cuadrada = numero) raiz(4)*raiz(4)=4")
	public void testComprobarRaiz() {
		assertEquals(Calculator.multiplicacion(2,2),  Calculator.multiplicacion(Calculator.calcularRaizCuadrada(4), Calculator.calcularRaizCuadrada(4)));
	}

}
