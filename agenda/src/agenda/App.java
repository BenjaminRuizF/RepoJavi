package agenda;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Agenda A1 = new Agenda();
		Contacto C1 = new Contacto("Anuel", "657756576");
		Contacto C2 = new Contacto("Ferxxo", "689986869");
		Contacto C3 = new Contacto("Mora", "623326236");
		Contacto C4 = new Contacto("Quepedo", "615516156");
		switch (mostrarMenu()) {

		case 1:
			AniadirContacto();
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
			
		default:
			System.out.println("La seccion seleccionada esta en reformas");
		}
		
	}
	public static int mostrarMenu() {
		int menu;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Agenda de contactos");
		System.out.println("1. Añadir contacto");
		System.out.println("2. ¿Existe contacto?");
		System.out.println("3. Listar contactos");
		System.out.println("4. Buscar contacto");
		System.out.println("5. Eliminar contacto");
		System.out.println("6. Huecos en la agenda");
		System.out.println("7. Salir");
		menu = teclado.nextInt();
		return menu;
	}

}
