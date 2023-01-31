package password;

public class App {

	public static void main(String[] args) {
		Password [] P1 = new Password[5];
		boolean [] f = new boolean[5];
		for (int i = 0; i < P1.length; i++) {
			P1[i] = new Password(30);
			f[i]= P1[i].esFuerte();
			System.out.println(P1[i].getContrasenia()+"_"+f[i]);
		}
	}

}
