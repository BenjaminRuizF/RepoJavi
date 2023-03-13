package aulas;

public class Profesor extends Persona {
	private String materia;

	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		comprobarMateria(materia);
		// TODO Auto-generated constructor stub
	}

	public void comprobarMateria(String materia) {
		if (!materia.equalsIgnoreCase("matematicas") && !materia.equalsIgnoreCase("Filosofia")
				&& !materia.equalsIgnoreCase("Fisica")) {
			this.materia = "Matematicas";
		}
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public boolean asistir() {
		int num = (int) (Math.random() * 100);
		if (num <= 20) {
			setEsta(false);
			return false;
		}
		setEsta(true);
		return true;
	}

	@Override
	public String toString() {
		return super.toString()+"Profesor [materia=" + materia + "]";
	}
	
}
