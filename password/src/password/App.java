package password;

public class App {

	public static void main(String[] args) {
		Password P1 = new Password();
		Password P2 = new Password(9);
		P1.setLongitud(8);
		System.out.println(P1.getContrasenia());
		while(P1.esFuerte()!=true) {
			P1.generarPassword();
			System.out.println(P1.getContrasenia());
		}
	}

}
