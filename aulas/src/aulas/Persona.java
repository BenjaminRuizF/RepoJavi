package aulas;

public class Persona {
	private String nombre;
	private static final char SEXO = 'H';
	private int edad;
	private char sexo;
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		comprobarSexo(sexo);
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void comprobarSexo(char sexo) {
		if(sexo != 'M'||sexo != 'm') {
			this.sexo=SEXO;
		}
		this.sexo = sexo;
	}
}
