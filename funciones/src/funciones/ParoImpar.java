package funciones;

public class ParoImpar {
	public static boolean ParoNo(int x) {
		return x%2==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (ParoNo(4)) {
			System.out.println("Es par");
		}else System.out.println("Es impar");
	}

}
