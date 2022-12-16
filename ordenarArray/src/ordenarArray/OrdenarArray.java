package ordenarArray;

import java.util.Arrays;

public class OrdenarArray {

	public static void main(String[] args) {
		int[] array = { 1, 7, 2, 9, -3 };
		int aux;
		boolean cambio = true;
		while (cambio != false) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
					System.out.println(Arrays.toString(array));
				}
			}
			cambio = true;
		}

	}

}
