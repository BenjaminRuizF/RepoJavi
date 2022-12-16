package cumpleaños;

import java.util.Scanner;

public class cumpleaños {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una fecha en formato dd/mmm/yyyy");
		String fecha1 = teclado.next();
		System.out.println("Dime otra fecha en formato dd/mmm/yyyy");
		String fecha2 = teclado.next();
		String[] partida1 = fecha1.split("/");
		int dia1 = Integer.parseInt(partida1[0]);
		String mes1 = (partida1[1].toLowerCase());
		int anio1 = Integer.parseInt(partida1[2]);
		String[] partida2 = fecha2.split("/");
		int dia2 = Integer.parseInt(partida2[0]);
		String mes2 = (partida2[1].toLowerCase());
		int anio2 = Integer.parseInt(partida2[2]);
		if (anio1 < 1900 || anio2 < 1900) {
			System.out.println("Año erroneo");
		}
		switch (mes1) {
		case "ene":
			break;
		case "feb":
			break;
		case "mar":
			break;
		case "abr":
			break;
		case "may":
			break;
		case "jun":
			break;
		case "jul":
			break;
		case "ago":
			break;
		case "sep":
			break;
		case "oct":
			break;
		case "nov":
			break;
		case "dic":
			break;
		default:
			System.out.println("Mes erroneo");
		}
		switch (mes2) {
		case "ene":
			break;
		case "feb":
			break;
		case "mar":
			break;
		case "abr":
			break;
		case "may":
			break;
		case "jun":
			break;
		case "jul":
			break;
		case "ago":
			break;
		case "sep":
			break;
		case "oct":
			break;
		case "nov":
			break;
		case "dic":
			break;
		default:
			System.out.println("Mes erroneo");
		}
		if (mes1 == "ene" || mes1 == "mar" || mes1 == "may" || mes1 == "jul" || mes1 == "ago" || mes1 == "oct"
				|| mes1 == "dic") {
			
		}
		
		
		
		teclado.close();
	}

}
