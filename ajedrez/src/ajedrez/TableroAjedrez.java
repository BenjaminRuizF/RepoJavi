package ajedrez;

import java.util.Arrays;

public class TableroAjedrez {
	public static char ordenar(char[][] tablero) {
	
		char d = 0;
		return d;
	}

	public static void pintar(char[][] tablero) {
		System.out.print("  ");
		char letra = 65;
		while (letra != 'I') {
			System.out.print(letra + " ");
			letra++;
		}
		System.out.print("\n");

		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[i].length; j++) {

				if ((i + j) % 2 == 0)
					tablero[i][j] = 'B';
				else
					tablero[i][j] = 'N';

			}
			switch (i) {
			case 0:
				System.out.println(8 + " " + tablero[i]);
				System.out.println(tablero[i]);
				break;
			case 1:
				System.out.println(7 + " " + tablero[i]);
				break;
			case 2:
				System.out.println(6 + " " + tablero[i]);
				break;
			case 3:
				System.out.println(5 + " " + tablero[i]);
				break;
			case 4:
				System.out.println(4 + " " + tablero[i]);
				break;
			case 5:
				System.out.println(3 + " " + tablero[i]);
				break;
			case 6:
				System.out.println(2 + " " + tablero[i]);
				break;
			case 7:
				System.out.println(1 + " " + tablero[i]);
				break;

			}

		}
	}

	public static void main(String[] args) {
		char[][] tablero = new char[8][8];
		pintar(tablero);

	}

}
