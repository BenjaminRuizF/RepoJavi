package mezclaArray;

import java.util.Arrays;

public class mezcla {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 4, 65, 7, 34, 21, 33, 9, -37 };
		int[] array2 = { 4, 7, 8, -23, 12, 87, 90, 1, 15, 2 };
		int[] array3 = new int[20];
		int j = 0;
		for (int i = 0; i < array3.length; i = i + 2) {
			array3[i] = array1[j];
			array3[i + 1] = array2[j];
			j++;
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
	}

}
