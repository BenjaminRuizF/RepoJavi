package centroEducativo;

public class Estudiante extends Persona {
	private String Curso;

	public Estudiante(String nombre, int edad, String dNI, String Curso) {
		super(nombre, edad, dNI);
		this.Curso = Curso;
	}

	@Override
	public String toString() {
		return super.toString()+ "Estudiante [Curso=" + Curso + "]";
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}
	
	
}
