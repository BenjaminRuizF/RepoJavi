package ParseInt;

import java.util.Scanner;

public class ParseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dime una fecha partida por / ");
		String fecha = teclado.nextLine();
		String [] fechapartida = fecha.split("/");
		System.out.println(fechapartida[0]);
		System.out.println(fechapartida[1]);
		System.out.println(fechapartida[2]);
		int dia = Integer.parseInt(fechapartida[0]);
		System.out.println(dia+" este es el entero");
		teclado.close();
	}

}
