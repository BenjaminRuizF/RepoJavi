package hastaSalir;

import java.util.Scanner;

public class HastaSalir {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String pass = "salir";
		String entrada = "";
		System.out.println("Escribe lo que quieras o (salir) para salir");
		do {
			entrada = teclado.next();
			System.out.println(entrada);
		} while (!entrada.equalsIgnoreCase(pass));
		System.out.println("Adios");
		teclado.close();

	}

}
