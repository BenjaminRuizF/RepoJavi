package mezclaArray;

import java.util.Arrays;
import java.util.Scanner;

public class mezaclaContinua {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int longitud;
		int longitud2;
		int num1;
		int num2;
		int j=0;
		int j2=0;
		System.out.println("Dime la longitud de el primer array");
		longitud = teclado.nextInt();
		System.out.println("Dime la longitud del segundo array");
		longitud2 = teclado.nextInt();
		int[] array1 = new int[longitud];
		int[] array2 = new int[longitud2];
		int[] array3 = new int[longitud+longitud2];
		
	
		System.out.println("Dime los numeros del primer array");
		num1 = teclado.nextInt();
		System.out.println("Dime los numeros del segundo array");
		num2 = teclado.nextInt();
		
		for (int i = 0; i < array3.length; i = i + 2) {
			array3[i] = array1[j];
			array3[i + 1] = array2[j2];
		
		}
		System.out.println(array1);
		System.out.println(array2);
		System.out.println(array3);
		teclado.close();

	}

}
