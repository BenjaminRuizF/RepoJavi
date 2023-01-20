package persona;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime nombre");
		String nombre = teclado.nextLine();
		System.out.println("Dime edad");
		int edad = teclado.nextInt();
		System.out.println("Dime sexo -M o H-");
		char sexo = teclado.next().charAt(0);
		System.out.println("Dime peso");
		double peso =teclado.nextDouble();
		System.out.println("Dime altura");
		double altura =teclado.nextDouble();
		System.out.println("Dime DNI");
		String DNI =teclado.nextLine();
		Persona P1 = new Persona(nombre, edad, sexo, DNI, peso, altura);
		Persona P2 = new Persona(nombre, edad, sexo);
		Persona P3 = new Persona();
		
		P3.setNombre("Marina");
		P3.setEdad(10);
		P3.setAltura(1.50);
		P3.setPeso(80.3);
		P3.setSexo('J');
		System.out.println(P1.toString());
		System.out.println(" ");
		System.out.println(P2.toString());
		System.out.println(" ");
		System.out.println(P3.toString());
		System.out.println(" ");
		llamarAImc(P1);
		llamarAImc(P2);
		llamarAImc(P3);
		
		esMayorEdad(P1);
		esMayorEdad(P2);
		esMayorEdad(P3);
		teclado.close();
	}
	public static void llamarAImc(Persona P) {
		int imc = P.calculadoraIMC();
		switch (imc) {
		case 1:
			System.out.println(P.getNombre()+" con DNI "+P.getDNI()+" tiene sobrepeso");
			break;
		case 0:
			System.out.println(P.getNombre()+" con DNI "+P.getDNI()+" tiene el peso ideal");
			break;
		case -1:
			System.out.println(P.getNombre()+" con DNI "+P.getDNI()+" esta delgado");
			break;
		default:
			
			break;
		}
		
	} 
	public static void esMayorEdad(Persona P) {
		if(P.esMayorDeEdad()) {
			System.out.println(P.getNombre()+" con DNI "+P.getDNI()+" es mayor de edad");
		}else System.out.println(P.getNombre()+" con DNI "+P.getDNI()+" no es mayor de edad");
	}
}
