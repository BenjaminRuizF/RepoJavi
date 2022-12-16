package matrizConBordes;

import java.util.Arrays;

public class Matriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[8][6];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 0 || i == matriz.length-1|| j== 0||j == matriz[i].length-1) {
					matriz[i][j] = 1;
				}
				
			}
			System.out.println(Arrays.toString(matriz[i]));
		}
	}

}