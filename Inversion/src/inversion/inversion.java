package inversion;

import java.util.Scanner;

public class inversion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuanto vas a invertir");
		double inversion = teclado.nextDouble();
		System.out.println("De cuanto es el interes anual");
		double interes = teclado.nextDouble();
		System.out.println("Durante cuantos años");
		int anios = teclado.nextInt();
		for (int i = 1; i <= anios; i++) {
			System.out.println("capital obtenido el año " + i + ": " + inversion*(interes/100));
			inversion += inversion * (interes / 100);
		}
		teclado.close();
	}

}
