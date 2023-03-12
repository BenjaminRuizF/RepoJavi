package matriz4z4;

import java.util.Scanner;

public class Matriz4x4 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		boolean relleno = false;
		int menu = mostrarMenu();
		System.out.println(menu);
		do {
			switch (menu) {
			case 1:
				if (relleno == false) {
					rellenar(matriz);
					System.out.println("Matriz llena");
					relleno = true;
					System.out.println(menu);
				} else {
					System.out.println("La matriz ya esta llena");
					System.out.println(menu);
				}
				break;
			case 2:
				if (relleno == false) {
					System.out.println("La matriz no esta llena");
				} else {
					sumarFila(matriz);
				}
				break;
			case 3:
				if (relleno == false) {
					System.out.println("La matriz no esta llena");
				} else {
					// sumarColumna(matriz);
				}
				break;
			case 4:
				if (relleno == false) {
					System.out.println("La matriz no esta llena");
				} else {
					// sumarDiagonal(matriz);
				}
				break;
			case 5:
				if (relleno == false) {
					System.out.println("La matriz no esta llena");
				} else {
					// sumarInversa(matriz);
				}
				break;
			case 6:
				if (relleno == false) {
					System.out.println("La matriz no esta llena");
				} else {
					// media(matriz);
				}
				break;
			case 7:
				System.out.println("Adios");
				return;
			default:
			}

		} while (menu != 7);
	}

	public static int mostrarMenu() {
		int menu;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Menu de opciones");
		System.out.println("1. Rellenar la matriz");
		System.out.println("2. Sumar filas");
		System.out.println("3. Sumar columnas");
		System.out.println("4. Sumar la diagonal");
		System.out.println("5. Sumar la diagonal inversa");
		System.out.println("6. Media de la matriz");
		System.out.println("7. Salir");
		menu = teclado.nextInt();
		return menu;
	}

	public static void rellenar(int[][] matriz) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduzca un numero [" + i + "," + j + "]");
				matriz[i][j] = teclado.nextInt();
			}
		}
	}

	public static void sumarFila(int[][] matriz) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una fila para sumarla");
		int fila = teclado.nextInt();
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//if () {
					suma += matriz[i][j];
				}
			}
		}
	}

///}
