package contraseña;

import java.util.Scanner;

public class contraseña {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String contrasenia = "";
		String entrada = "";
		System.out.println("Dime una contrasenia");
		entrada = teclado.next();
		do {
			System.out.println("Repite la contraseña");
			contrasenia = teclado.next();
		} while (!contrasenia.equals(entrada));
		System.out.println("Aceptada");
		teclado.close();
	}

}
