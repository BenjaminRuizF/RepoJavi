package seleccionFutbol;

public class App {

	public static void main(String[] args) {
		Masajista m1 = new Masajista(1, "Pablo", "Wiza", 40, "La vida", 20);
		Entrenador e1 = new	Entrenador(1, "Benja", "Ruiz", 19, 777);
		Futbolista f1 = new Futbolista(1, "Raul", "El Father", 24, 69, "MC");
		Futbolista f2 = new Futbolista(2, "Carlos", "El Tonto", 18, 89, "Delantero pichichi");
		System.out.println(m1.toString());
		System.out.println(e1.toString());
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		m1.darMasaje();
		
	}

}
