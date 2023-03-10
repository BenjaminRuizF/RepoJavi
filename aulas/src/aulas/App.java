package aulas;

public class App {

	public static void main(String[] args) {
		Profesor p1 = new Profesor("Paco", 30, 'H', "Fisica");
		Estudiante e1 = new Estudiante("Pedro", 18, 'x', 8);
		System.out.println(p1.getEdad());
		e1.faltaClase();
	}

}
