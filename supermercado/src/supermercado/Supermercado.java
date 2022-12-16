package supermercado;

import java.util.Scanner;

public class Supermercado {
	public static int mostrarMenu() {
		int menu;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Supermercado");
		System.out.println("1. Carniceria");
		System.out.println("2. Pescaderia");
		System.out.println("3. Fruteria");
		System.out.println("4. Drogueria");
		System.out.println("5. Salir");
		menu = teclado.nextInt();
		return menu;
	}

	public static double Carniceria() {
		int carne;
		double total = 0;
		double cantidad = 0.0;
		double suma = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Carniceria:");
			System.out.println("1. Filetaco 20€/Kg");
			System.out.println("2. Pollon 8.78€/Kg");
			System.out.println("3. It´s a secret 7.67€/Kg");
			System.out.println("4. Salir");
			carne = teclado.nextInt();
			switch (carne) {
			case 1:
				System.out.println("Cuanto quieres:");
				cantidad = teclado.nextDouble();
				suma += cantidad * 20;
				System.out.println("Llevas  gastado " + suma + " € en la carniceria");
				break;
			case 2:

				System.out.println("Cuanto quieres:");
				cantidad = teclado.nextDouble();
				suma += cantidad * 8.78;
				System.out.println("Llevas  gastado " + suma + " € en la carniceria");
				break;
			case 3:
				System.out.println("Cuanto quieres:");
				cantidad = teclado.nextDouble();
				suma += cantidad * 7.67;
				System.out.println("Llevas  gastado " + suma + " € en la carniceria");
				break;
			case 4:
				System.out.println("Has salido de la carniceria");
				break;
			default:
				System.out.println("Esa pieza de carne la estan cazando ahora mismo");
			}

		} while (carne != 4);
		System.out.println(suma);
		// System.out.println(mostrarMenu());
		return suma;
	}

	public static double Pescaderia() {
		int peces;
		double total = 0;
		double cantidad = 0.0;
		double suma = 0;
		do {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Pescaderia:");
			System.out.println("1. Tiburon 39.99€/Kg");
			System.out.println("2. Kraken 50€/Kg");
			System.out.println("3. Delfin 12.87€/Kg");
			System.out.println("4. Salir");
			peces = teclado.nextInt();
			switch (peces) {
			case 1:

				System.out.println("Cuanto quieres:");
				cantidad = teclado.nextDouble();
				suma += cantidad * 39.99;
				System.out.println("Llevas  gastado " + suma + " € en la pescaderia");
				break;
			case 2:

				System.out.println("Cuanto quieres:");
				cantidad = teclado.nextDouble();
				suma += cantidad * 50;
				System.out.println("Llevas  gastado " + suma + " € en la pescaderia");
				break;
			case 3:
				System.out.println("Cuanto quieres:");
				cantidad = teclado.nextDouble();
				suma += cantidad * 12.87;
				System.out.println("Llevas  gastado " + suma + " € en la pescaderia");
				break;
			case 4:
				System.out.println("Has salido de la pescaderia");
				break;
			default:
				System.out.println("Esa pieza de pescado la estan pescando ahora mismo");
			}

		} while (peces != 4);
		total = total + suma;
		return total;
	}

	public static double Fruteria() {
		int fruta;
		double cantidad = 0.0;
		double suma = 0;
		do {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Fruteria:");
			System.out.println("1. Rambutan 29.90€/Kg");
			System.out.println("2. Yaca 99.99€/Kg");
			System.out.println("3. Akebia 5.67€/Kg");
			System.out.println("4. Salir");
			fruta = teclado.nextInt();
			switch (fruta) {
			case 1:

				System.out.println("Cuanto quieres:");
				cantidad = teclado.nextDouble();
				suma += cantidad * 29.90;
				System.out.println("Llevas  gastado " + suma + " € en la fruteria");
				break;
			case 2:

				System.out.println("Cuanto quieres:");
				cantidad = teclado.nextDouble();
				suma += cantidad * 99.99;
				System.out.println("Llevas  gastado " + suma + " € en la fruteria");
				break;
			case 3:
				System.out.println("Cuanto quieres:");
				cantidad = teclado.nextDouble();
				suma += cantidad * 5.67;
				System.out.println("Llevas  gastado " + suma + " € en la fruteria");
				break;
			case 4:
				System.out.println("Has salido de la fruteria");
				break;
			default:
				System.out.println("Esa fruta esta creciendo ahora mismo");
			}

		} while (fruta != 4);
		
		return suma;
	}

	public static double Drogueria() {
		int droga;
		double total = 0;
		int cantidad = 0;
		double suma = 0;
		do {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Drogueria:");
			System.out.println("1. Sanytol 2.99€/Unidad");
			System.out.println("2. Detergente 3.99€/Unidad");
			System.out.println("3. Ambipur 5.99€/Unidad");
			System.out.println("4. Salir");
			droga = teclado.nextInt();
			switch (droga) {
			case 1:

				System.out.println("Cuantas unidades quieres:");
				cantidad = teclado.nextInt();
				suma += cantidad * 2.99;
				System.out.println("Llevas  gastado " + suma + " € en la drogueria");
				break;
			case 2:

				System.out.println("Cuantas unidades quieres:");
				cantidad = teclado.nextInt();
				suma += cantidad * 3.99;
				System.out.println("Llevas  gastado " + suma + " € en la drogueria");
				break;
			case 3:
				System.out.println("Cuantas unidades quieres:");
				cantidad = teclado.nextInt();
				suma += cantidad * 5.99;
				System.out.println("Llevas  gastado " + suma + " € en la drogueria");
				break;
			case 4:
				System.out.println("Has salido de la drogueria");
				break;
			default:
				System.out.println("Ese producto no tiene stock ahora mismo");
			}

		} while (droga != 4);
		total = total + suma;
		return total;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre = teclado.next();
		System.out.println("Hola " + nombre + ", bienvenido al supermercado Los Patos");
			switch (mostrarMenu()) {

			case 1:
				Carniceria();
				break;
			case 2:
				Pescaderia();
				break;
			case 3:
				Fruteria();
				break;
			case 4:
				Drogueria();
				break;
			case 5:
				System.out.println("Son x€");
				System.out.println("Con tarjeta o en efectivo");
				String pago = teclado.next();
				System.out.println("Muchas gracias " + nombre + " por venir a nuestro supermercado");
			default:
				System.out.println("La seccion seleccionada esta en reformas");
			}

		teclado.close();
	}

}
