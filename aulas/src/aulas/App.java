package aulas;

public class App {

	public static void main(String[] args) {
		Aula a1 = new Aula("Fisica");
		Aula a2 = new Aula("Filosofia");
		Aula a3 = new Aula("Matematicas");
		Profesor p1 = new Profesor("Javi", 38, 'M', "Matematicas");
		Profesor p2 = new Profesor("Luis", 20, 'M', "Fisica");
		Profesor p3 = new Profesor("Maria", 48, 'F', "Ingles");
		int Maximo = 10;
		String[] nombresM = { "Antonio", "Lucas", "Juanma", "Tiago", "Ruben", "Benjamin", "Carlos", "Adrian", "Abel",
				"Gonzalo", "Raul", "Pablo", "Alvaro", "Oscar" };
		String[] nombresF = { "Sandra", "Ana", "Lucia", "Carmen", "Erika", "Sara", "Yolanda", "Maria", "Andrea",
				"Diana", "Adela", "Kateryna", "Patri", "Carla" };
		a1.aniadirProfesor(p1);
		a2.aniadirProfesor(p2);
		a3.aniadirProfesor(p3);
		for (int i = 0; i < Maximo; i++) {
			int sex = (int) (Math.random() * 2);
			int nom = (int) (Math.random() * 14);
			if (sex == 0) {
				a1.aniadirAlumno(new Estudiante(nombresM[nom], 22, 'M', Math.random() * 10));
			}
			if (sex == 1) {
				a1.aniadirAlumno(new Estudiante(nombresF[nom], 21, 'F', Math.random() * 10));
			}

			sex = (int) (Math.random() * 2);
			nom = (int) (Math.random() * 14);
			if (sex == 0) {
				a2.aniadirAlumno(new Estudiante(nombresM[nom], 22, 'M', Math.random() * 10));
			}
			if (sex == 1) {
				a2.aniadirAlumno(new Estudiante(nombresF[nom], 21, 'F', Math.random() * 10));
			}

			sex = (int) (Math.random() * 2);
			nom = (int) (Math.random() * 14);
			if (sex == 0) {
				a3.aniadirAlumno(new Estudiante(nombresM[nom], 22, 'M', Math.random() * 10));
			}
			if (sex == 1) {
				a3.aniadirAlumno(new Estudiante(nombresF[nom], 21, 'F', Math.random() * 10));
			}
		}
		a1.mostrarAprobados();
		a2.mostrarAprobados();
		a3.mostrarAprobados();
	}

}
