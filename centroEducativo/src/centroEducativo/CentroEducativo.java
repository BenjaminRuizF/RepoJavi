package centroEducativo;

import java.util.HashMap;
import java.util.Scanner;

public class CentroEducativo {
	private String nombre;
	private HashMap<String, Persona> Personas;

	public CentroEducativo(String nombre) {
		this.nombre = nombre;
		Personas = new HashMap<>();
	}

	public void addPersona(Persona P) {
		if (P == null)
			return;
		if (Personas.containsKey(P.getDNI()))
			return;
		Personas.put(P.getDNI(), P);
	}

	public Persona getPersona(String dni) {
		return Personas.get(dni);
	}

	public void editPersona(String dni) {
		Persona p = getPersona(dni);
		Scanner t = new Scanner(System.in);
		System.out.println("Que modificar");
		System.out.println("1. Edad");
		System.out.println("2. Nombre");
		System.out.println("3. Clase (solo alumno)");
		System.out.println("4. Seminario (solo profesor)");
		System.out.println("5. Especialidad (solo mantenimiento)");
		System.out.println("0. Salir");
		int opt = t.nextInt();
		do {
			switch (opt) {
			case 1:
				System.out.println("Nueva edad: ");
				getPersona(dni).setEdad(t.nextInt());
				break;
			case 2:
				System.out.println("Nuevo nombre");
				getPersona(dni).setNombre(t.next());
				break;
			case 3:
				if (getPersona(dni) instanceof Estudiante) {
					Estudiante e = (Estudiante) getPersona(dni);
					System.out.println("Nueva clase");
					e.setCurso(t.next());
					Personas.replace(dni, e);
				} else {
					System.out.println("No es estudiante");
				}
				break;
			case 4:
				if (getPersona(dni) instanceof Profesor) {
					Profesor P = (Profesor) getPersona(dni);
					System.out.println("Nuevo seminario");
					P.setSeminario(t.next());
					Personas.replace(dni, P);
				} else {
					System.out.println("No es profesor");
				}
				break;
			case 5:
				if (getPersona(dni) instanceof Mantenimiento) {
					Mantenimiento m = (Mantenimiento) getPersona(dni);
					System.out.println("Nueva especialidad");
					m.setEspecialidad(t.next());
					Personas.replace(dni, m);
				} else {
					System.out.println("No es de mantenimiento");
				}
				break;

			}
			System.out.println("Que modificar");
			System.out.println("1. Edad");
			System.out.println("2. Nombre");
			System.out.println("3. Clase (solo alumno)");
			System.out.println("4. Seminario (solo profesor)");
			System.out.println("5. Especialidad (solo mantenimiento)");
			System.out.println("0. Salir");
			opt = t.nextInt();
		} while (opt != 0);
	}

	public Persona eliminarPersona(String dni) {
		return Personas.remove(dni);
	}

	public void mostrar() {
		for (String per : Personas.keySet()) {
			Persona pp = Personas.get(per);
			System.out.println(per + " -> " + pp.toString());
		}
	}
}
