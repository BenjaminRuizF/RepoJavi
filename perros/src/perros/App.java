package perros;

public class App {

	public static void main(String[] args) {
		Reala R1 = new Reala();
		perros P1 = new perros("Pablo","Cocker",4,"negro");
		R1.aniadirPerro(new perros ("Carlos","Cocker",3,"Blanco"));
		R1.mostrarPerros();
		R1.aniadirPerro(P1);
		R1.mostrarPerros();
		R1.sacarPerros(1);
		R1.mostrarPerros();
	}

}
