package mezclaArray;

import java.util.Arrays;

public class Mezcla3en3 {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] array3 = new int[24];
		int i = 0;
		int j = 0;
		while (i < array1.length) {
			for (int k = 0; k < 3; k++) {
				array3[j] = array1[k + i];
				j++;
			}
			for (int k = 0; k < 3; k++) {
				array3[j] = array2[k + i];
				j++;
			}

			i += 3;
		}
		System.out.print(Arrays.toString(array3));
	}

}
