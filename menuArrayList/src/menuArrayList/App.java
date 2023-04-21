package menuArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Menu m = new Menu();
		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner t = new Scanner(System.in);
		// int menu = m.mostrarMenu();
		do {

			switch (m.mostrarMenu()) {
			case 1:
				System.out.println("Dime el numero que quieres añadir");
				int num = t.nextInt();
				array.add(num);
				break;
			case 2:
				System.out.println("Dime el numero que quieres buscar");
				int num2 = t.nextInt();
				System.out.println("El numero esta emn la posicion " + array.indexOf(num2));
				break;
			case 3:
				System.out.println("Dime la posicion del numero que quieres modificar");
				int pos = t.nextInt();
				System.out.println("Dime el nuevo numero");
				int num3 = t.nextInt();
				array.set(pos, num3);
				break;
			case 4:
				System.out.println("Dime la posicion del numero que quieres eliminar");
				int remove = t.nextInt();
				array.remove(remove);
				break;
			case 5:
				System.out.println("Dime el numero que quieres insertar");
				int ins = t.nextInt();
				System.out.println("Dime la posicion del numero que quieres insertar");
				int pos1 = t.nextInt();
				if (pos1 > array.size() || pos1 < 0) {
					System.err.print("NO se puede insertar");
				} else
					array.add(pos1, ins);

				break;
			case 6:
				System.out.println(array.toString());
				break;
			case 7:
				System.out.println("Adios");
			}

		} while (m.mostrarMenu() != 7);
	}

}
