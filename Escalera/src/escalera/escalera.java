package escalera;

import java.util.Scanner;

public class escalera {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num = teclado.nextInt();
		int ref = num;
		for (int i = 1; i <= ref; i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
			num--;
		}
			teclado.close();
	}

}
