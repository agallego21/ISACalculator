package com.unir.isa.calculator;

import java.util.Scanner;

public class Calculator {

	static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
	static int select = -1; //opci�n elegida del usuario
	static int num1 = 0, num2 = 0; //Variables
	
	public static void main(String[] args) {
		
		//Mientras la opci�n elegida sea 0, preguntamos al usuario
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("Elige opci�n:\n1.- Sumar" +
						"\n2.- Restar\n" +
						"3.- Multiplicar\n" +
						"4.- Dividir\n" +
						"0.- Salir");
				//Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(select){
				case 1: 
					pideNumeros();
					System.out.println(num1+" + "+num2+" = "+(num1+num2));
					break;
				case 2: 
					pideNumeros();
					System.out.println(num1+" - "+num2+" = "+(num1-num2));
					break;
				case 3: 
					pideNumeros();
					System.out.println(num1+" * "+num2+" = "+(num1*num2));
					break;
				case 4: 
					pideNumeros();
					System.out.println(num1+" / "+num2+" = "+(num1/num2));
					break;
				case 0: 
					System.out.println("Adios!");
					break;
				default:
					System.out.println("N�mero no reconocido");break;
				}
				
				System.out.println("\n"); //Mostrar un salto de l�nea en Java
				
			}catch(Exception e){
				System.out.println("Uoop! Error!");
			}
		}

	}
	
	//M�todo para recoger variables por consola
	public static void pideNumeros(){
		System.out.println("Introduce n�mero 1:");
		num1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Introduce n�mero 2:");
		num2 = Integer.parseInt(scanner.nextLine());

		//Mostrar un salto de l�nea en Java
		System.out.println("\n"); 
	}

	// Métodos de la calculadora
    public static Double suma(double d, double e) {

        return d + e;
    }

	public static Double resta(double i, double j) {

		return i - j;
	}

	public static Double multiplicacion(double i, double j) {

		return i * j;
	}

	// Comprobar multiplicacion cociente * divisor + resto = dividendo
	public static Double compruebaMDivision(double i, double j, double k) {

		return (i * j) + k;
	}

	public static Integer division(int i, int j) {

		return i / j;
	}

	// FALTA IMPLEMENTAR
    // Método para calcular la raíz cuadrada utilizando el Método de Herón
   // Método para calcular la diferencia absoluta
    private static double diferenciaAbsoluta(double a, double b) {
        return a > b ? a - b : b - a;
    }

    // Método para calcular la raíz cuadrada utilizando el Método de Herón
    public static double calcularRaizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }

        // Estimación inicial
        double estimacion = numero / 2.0;
        double diferencia;

        do {
            // Mejora de la estimación
            double nuevaEstimacion = (estimacion + numero / estimacion) / 2.0;
            diferencia = diferenciaAbsoluta(nuevaEstimacion, estimacion);
            estimacion = nuevaEstimacion;
        } while (diferencia > 1e-10); // 1e-10 es el umbral de precisión

        return estimacion;
    }


	
}

  


