package ordenarArray;

import java.util.Arrays;

public class ComoEstaOrdenado {

	public static void main(String[] args) {
		int[] array = { 2, 1, 3, 4, 5, 6, 7 };
		int i;
		for (i = 0; i < array.length; i++) {

		}
		if (array[i] < array[i + 1]) {
			System.out.print(Arrays.toString(array) + " esta ordenado de forma creciente");
		} else {
			if (array[i] > array[i + 1]) {
				System.out.print(Arrays.toString(array) + " esta ordenado de forma decreciente");
			} else
				System.out.print(Arrays.toString(array) + " esta desordenado");
		}

	}

}
