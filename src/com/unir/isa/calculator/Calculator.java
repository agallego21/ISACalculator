package com.unir.isa.calculator;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Calculator {

	static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
	static int select = -1; //opción elegida del usuario
	
	public static void main(String[] args) {

		//Mientras la opción elegida sea 0, preguntamos al usuario
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{

				showMenu();
				
				//Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(select){
				case 1: 
					menuSuma();
					pressToContinue();
					break;
				case 2: 
					menuResta();
					pressToContinue();
					break;
				case 3: 
					menuMultiplicacion();
					pressToContinue();
					break;
				case 4: 
					menuDivision();
					pressToContinue();
					break;
				case 5: 
					menuRaizCuadrada();
					pressToContinue();
					break;
				case 0: 
					System.out.println("Adios!");
					break;
				default:
					System.out.println("\n    Operación no válida.");
					pressToContinue();
					break;
				}
				
				System.out.println("\n"); //Mostrar un salto de l�nea en Java
				
			}catch(Exception e){
				System.out.println("Uoop! Error!");
			}
		}

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

   // Método para calcular la diferencia absoluta
    private static double diferenciaAbsoluta(double a, double b) {
        return a > b ? a - b : b - a;
    }

    // Método para calcular la raíz cuadrada utilizando el Método de Herón
    public static double calcularRaizCuadrada(double numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }

        // Estimación inicial
        double estimacion = numero / 2.0;
        double diferencia;
        do {
            // Mejora de la estimación
            double nuevaEstimacion = (estimacion + numero / estimacion) / 2.0;
            diferencia = diferenciaAbsoluta(nuevaEstimacion, estimacion);
            estimacion = nuevaEstimacion;
            
        } while (diferencia > 1e-3); // 1e-3 es el umbral de precisión

        return BigDecimal.valueOf(estimacion)
        	    .setScale(3, RoundingMode.HALF_UP)
        	    .doubleValue();		//Redondeamos a tres dígitos
    }


    /**
     * Muestra el menú de la calculador, borrando el contenido de la pantalla
     */
    private static void showMenu() throws InterruptedException, IOException{
    	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    	System.out.println("==========================="+
    			"\n    *** CALCULADORA ***"+
    			"\n==========================="+
    			"\nOperaciones disponibles:" + 
    			"\n  1) Suma" + 
    			"\n  2) Resta" + 
    			"\n  3) Multiplicación" + 
    			"\n  4) División" + 
    			"\n  5) Raíz cuadrada" + 
    			"\n\n  0) Salir");
    	System.out.print("\n\n  Por favor, seleccione la operación deseada:  ");
    }
    
    
	/**
	 * Solicita un número por pantalla
	 */
	private static void pressToContinue(){
		System.out.print("\n    Pulse <Enter> para continuar...");
		scanner.nextLine();
	}
	
	/**
	 * Para la ejecución hasta que se pulse una tecla
	 */
	private static Double insertNumber(int order){
		System.out.print("    Introduzca número "+order+":  ");
		return Double.parseDouble(scanner.nextLine());
	}
	
	/**
	 * Muestr el resultado de la operación
	 */
	private static void showResult(){
		System.out.print("\n    Pulse <Enter> para continuar...");
		scanner.nextLine();
	}
	
	private static void menuSuma() {
		double a = 0;
		double b = 0;
		a=insertNumber(1);
		b=insertNumber(2);
		System.out.println("             ------------------------");
		System.out.println("             Resultado :  "+(a+b));	
	}
	
	private static void menuResta() {
		double a = 0;
		double b = 0;
		a=insertNumber(1);
		b=insertNumber(2);
		System.out.println("             ------------------------");
		System.out.println("             Resultado :  "+(a-b));	
	}
	private static void menuMultiplicacion() {
		double a = 0;
		double b = 0;
		a=insertNumber(1);
		b=insertNumber(2);
		System.out.println("             ------------------------");
		System.out.println("             Resultado :  "+(a-b));	
	}
	
	private static void menuDivision() {
		double a = 0;
		double b = 0;
		a=insertNumber(1);
		b=insertNumber(2);
		System.out.println("             ------------------------");
		System.out.println("             Resultado :  "+(a-b));	
	}
	
	private static void menuRaizCuadrada() {
		double a = 0;
		a=insertNumber(1);
		System.out.println("             ------------------------");
		System.out.println("             Resultado :  "+(calcularRaizCuadrada(a)));	
	}
}

  


