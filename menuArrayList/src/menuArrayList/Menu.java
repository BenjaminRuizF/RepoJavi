package menuArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	public int mostrarMenu() {
		int menu;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Menu de opciones");
		System.out.println("1. Agregar numero");
		System.out.println("2. Buscar numero");
		System.out.println("3. Modificar numero");
		System.out.println("4. Eliminar numero");
		System.out.println("5. Insertar numero");
		System.out.println("6. Ver array");
		System.out.println("7. Salir");
		menu = teclado.nextInt();
		return menu;
	}
}
