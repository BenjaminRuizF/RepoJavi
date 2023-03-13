package aulas;

public class Estudiante extends Persona {
	private double nota;

	public Estudiante(String nombre, int edad, char sexo, double nota) {
		super(nombre, edad, sexo);
		comprobarNota(nota);
	}

	public void comprobarNota(double nota) {
		if (nota < 0 || nota > 10) {
			this.nota = 0;
		}
		this.nota = nota;
	}

	public double getNota() {
		return nota;
	}

	public boolean asistir() {
		int num = (int) (Math.random() * 100);
		if (num <= 50) {
			setEsta(false);
			return false;
		}
		setEsta(true);
		return true;
	}

	@Override
	public String toString() {
		return super.toString()+"Estudiante [nota=" + nota + "]";
	}
	
}
