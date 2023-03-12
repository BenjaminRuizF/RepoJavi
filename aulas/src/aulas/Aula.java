package aulas;

public class Aula {
	private int codClase;
	private int maximo;
	private String asignatura;
	
	public Aula(int codClase, int maximo, String asignatura) {
		this.codClase = codClase;
		this.maximo = maximo;
		this.asignatura = asignatura;
	}
	
	public int getCodClase() {
		return codClase;
	}

	public int getMaximo() {
		return maximo;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void comprobarAsignatura(String asignatura) {
		if(!asignatura.equalsIgnoreCase("matematicas")&&!asignatura.equalsIgnoreCase("Filosofia")&&!asignatura.equalsIgnoreCase("Fisica")) {
			System.err.println("Asignatura invalida");
			System.exit(0);
		}
		this.asignatura = asignatura;
	}
	public boolean darClase() {
		l
		return true;
	}
}
