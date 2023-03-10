package aulas;

public class Estudiante extends Persona {
	private double nota;

	public Estudiante(String nombre, int edad, char sexo, double nota) {
		super(nombre, edad, sexo);
		comprobarNota(nota);
	}

	public void comprobarNota(double nota) {
		if (nota < 0 || nota > 10) {
			System.err.println("Nota erronea");
			System.exit(0);
		}
		this.nota = nota;
	}

	public double getNota() {
		return nota;
	}

	public boolean faltaClase() {
		boolean posibilidades = true;
		int num = (int) (Math.random() * 100);
		if(num<0||num>100) {
			System.exit(0);
		}
		if (num >= 0 && num <= 50) {
			posibilidades = true;
		} else if (num > 50 && num <= 100) {
			posibilidades = false;
		}
		return posibilidades;
	}
}
