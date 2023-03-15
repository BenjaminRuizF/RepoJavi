package aulas;

public class Aula {
	private static int id = 1;
	private int ident;
	private String asignatura;
	private Profesor p1;
	private Estudiante[] mesas;

	public Aula(String asignatura) {
		ident = id;
		id++;
		comprobarAsignatura(asignatura);
		mesas = new Estudiante[10];
		p1 = null;
	}

	public void comprobarAsignatura(String asignatura) {
		if (!asignatura.equalsIgnoreCase("matematicas") && !asignatura.equalsIgnoreCase("Filosofia")
				&& !asignatura.equalsIgnoreCase("Fisica")) {
			this.asignatura = "matematicas";
		}
		this.asignatura = asignatura;
	}

	public void aniadirProfesor(Profesor p) {
		if (p1 == null) {
			p1 = p;
		} else
			System.out.println("Ya hay profesor");
	}

	public void aniadirAlumno(Estudiante e) {
		for (int i = 0; i < mesas.length; i++) {
			if (mesas[i] == null) {
				mesas[i] = e;
				mesas[i].asistir();
				return;
			}
		}
		System.out.println("No hay mas espacio");
	}

	public boolean darClase() {
		if (p1 == null) {
			return false;
		}
		if (!asignatura.equalsIgnoreCase(p1.getMateria())) {
			return false;
		}
		if (!p1.asistir()) {
			return false;
		}
		int asistencia = 0;
		for (int i = 0; i < mesas.length; i++) {
			if (mesas[i] == null) {
				continue;
			}
			if (mesas[i].asistir()) {
				asistencia++;
			}
		}
		if (asistencia >= mesas.length / 2) {
			return true;
		}
		return false;
	}

	public void mostrarAprobados() {
		int chico = 0;
		int chica = 0;
		if (!darClase()) {
			System.out.println("No se puede dar clase");
		}
		for (int i = 0; i < mesas.length; i++) {
			if (mesas == null) {
				continue;
			}
			if ('F' == mesas[i].getSexo() && mesas[i].getNota() >= 5) {
				chica++;
			}
			if ('M' == mesas[i].getSexo() && mesas[i].getNota() >= 5) {
				chico++;
			}
		}
		System.out.println("El total de chicas aprobadas es: " + chica);
		System.out.println("El total de chicos aprobados es: " + chico);
	}
}
