package ordenarArray;

import java.util.Arrays;

public class OrdenarCorrecto {

	public static void main(String[] args) {
		int[] burbuja = { 1, 7, 2, 9, -3 };
		int swap;
		boolean ordenado = false;
		System.out.println(Arrays.toString(burbuja));
		while (!ordenado) {
			ordenado = true;
			for (int i = 0; i < burbuja.length - 1; i++) {
				if (burbuja[i] > burbuja[i + 1]) {
					swap = burbuja[i + 1];
					burbuja[i + 1] = burbuja[i];
					burbuja[i] = swap;
					ordenado = false;
					System.out.println(Arrays.toString(burbuja));
				}
				
			}
		}

	}

}
