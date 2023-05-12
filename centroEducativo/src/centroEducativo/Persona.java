package centroEducativo;

public abstract class Persona {
	private String Nombre;
	private int edad;
	private String DNI;
	public Persona(String nombre, int edad, String dNI) {
		Nombre = nombre;
		this.edad = edad;
		DNI = dNI;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", edad=" + edad + ", DNI=" + DNI + "]";
	}
	
	
}
