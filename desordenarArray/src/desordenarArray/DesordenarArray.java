package desordenarArray;

import java.util.Arrays;

public class DesordenarArray {

	public static void desorden(int array[]) {
		int swap;
		for (int i = 0; i < array.length; i++) {
			int random = (int) (Math.random() * array.length);
			swap = array[random];
			array[random] = array[i];
			array[i] = swap;
			System.out.println(Arrays.toString(array));
		}

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		desorden(array);
		
	}

}
