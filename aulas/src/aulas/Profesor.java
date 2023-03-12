package aulas;

public class Profesor extends Persona{
	private String materia;

	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		comprobarMateria(materia);
		// TODO Auto-generated constructor stub
	}
	public void comprobarMateria(String materia) {
		if(!materia.equalsIgnoreCase("matematicas")&&!materia.equalsIgnoreCase("Filosofia")&&!materia.equalsIgnoreCase("Fisica")) {
			System.err.println("Asignatura invalida");
			System.exit(0);
		}
		this.materia = materia;
	}
	public String getMateria() {
		return materia;
	}
	public boolean faltaClase() {
		boolean posibilidades = true;
		int num = (int) (Math.random() * 100);
		if(num<0||num>100) {
			System.exit(0);
		}
		if (num >= 0 && num <= 20) {
			posibilidades = false;
		} else if (num > 20 && num <= 100) {
			posibilidades = true;
		}
		return posibilidades;
	}
}
