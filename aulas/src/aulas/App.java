package aulas;


public class App {

	public static void main(String[] args) {
		Aula a = new Aula(2, 10, "matematicas");
		Aula[] a1 = new Aula[a.getMaximo()];
		Profesor p1 = new Profesor("Paco", 30, 'H', "Fisica");
		Estudiante e1 = new Estudiante("Pedro", 18, 'x', 8);
		System.out.println(p1.getEdad());
		System.out.println(e1.faltaClase());
	}

}
