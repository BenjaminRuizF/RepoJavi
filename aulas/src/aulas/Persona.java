package aulas;

public abstract class Persona {
	private String nombre;
	private static final char SEXO = 'H';
	private int edad;
	private char sexo;
	private boolean esta;

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		comprobarSexo(sexo);
		this.esta = false;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isEsta() {
		return esta;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEsta(boolean esta) {
		this.esta = esta;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void comprobarSexo(char sexo) {
		if (sexo != 'M' || sexo != 'm') {
			this.sexo = SEXO;
		}
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}

	public abstract boolean asistir();
}
