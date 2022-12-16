package funciones;

import java.util.Scanner;

public class Calculadora {
	public static int mostrarMenu() {
		int menu;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Menu de opciones");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		menu = teclado.nextInt();
		return menu;
		
	}

	public static int Suma(int a, int b) {
		return a + b;
	}

	public static int Resta(int a, int b) {
		return a - b;
	}

	public static int Mult(int a, int b) {
		return a * b;
	}

	public static double Div(double a, double b) {
		if (b != 0) {
			return a / b;
		}
		return Double.NaN;

	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		int b;
		switch (mostrarMenu()) {
		case 1:
			System.out.println("Dime un numero");
			a = teclado.nextInt();
			System.out.println("Dime otro numero para sumarlos");
			b = teclado.nextInt();
			System.out.println(Suma(a, b));
			break;
		case 2:
			System.out.println("Dime un numero");
			a = teclado.nextInt();
			System.out.println("Dime otro numero para restarlos");
			b = teclado.nextInt();
			System.out.println(Resta(a, b));
			break;
		case 3:
			System.out.println("Dime un numero");
			a = teclado.nextInt();
			System.out.println("Dime otro numero para multiplicarlos");
			b = teclado.nextInt();
			System.out.println(Mult(a, b));
			break;
		case 4:
			System.out.println("Dime un numero");
			a = teclado.nextInt();
			System.out.println("Dime otro numero para dividirlos");
			b = teclado.nextInt();
			System.out.println(Div(a, b));
			break;
		default:
			System.out.println("Opcion no valida");
		}
		teclado.close();
	}

}
