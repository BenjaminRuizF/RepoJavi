package edad;

import java.util.Scanner;

public class Edad2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dime tu edad");
		int num = teclado.nextInt();
		if(num>=18 && num%3!=0)
			System.out.println(1);
		else
			System.out.println(0);
		
		teclado.close();
	}

}