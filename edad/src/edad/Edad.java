/*Escribe un programa que solicite tu edad y muestre un 1
 * por pantalla si eres mayor de edad o tu edad no es 
 * multiplo de tres
 * El programa mostrara un 0 en caso contrario
 * Prueba que se muestre si introduces: 15, 17, 20, 21.
 */
package edad;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dime tu edad");
		int num = teclado.nextInt();
		
		if(num>=18 || num%3!=0)
			System.out.println(1);
		else
			System.out.println(0);
		
		teclado.close();
	}

}
