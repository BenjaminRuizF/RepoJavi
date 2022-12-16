package contraseña;

import java.util.Scanner;

public class Resultado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String pass = "contrasenia";
		String entrada = "";
		do {
			System.out.println("Dime una contrasenia");
			entrada = teclado.next();
		} while (!entrada.equals(pass));
		System.out.println("Aceptada");
		teclado.close();
	}

}
