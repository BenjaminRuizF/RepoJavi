package perros;

public class App {

	public static void main(String[] args) {
		perros P1 = new perros();
		perros P2 = new perros("Pablo", "Pitbull", 5, "Blanco");
		P1.setNombre("Carlos");
		P1.setRaza("Caniche");
		P1.setEdad(1);
		P1.setColor("Negro");
	}

}
