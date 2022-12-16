package juegoMayorMenor;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el numero que quieras adivinar");
		int numero = teclado.nextInt();
		int entrada;
		System.out.println("Dime un numero a ver si adivinas");
		do {
			entrada = teclado.nextInt();
			if (entrada > numero) {
				System.out.println("El numero es menor");
			} else if (entrada < numero) {
				System.out.println("El numero es mayor");
			} else System.out.println("Has acertado");
		} while (entrada != numero);
		teclado.close();

	}

}
