package perros;

public class perros {
	private String nombre;
	private String raza;
	private int edad;
	private String color;
	public perros(String nombre, String raza, int edad, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.color = color;
	}
	public perros() {
		nombre = "";
		raza = "";
		edad = 0;
		color = "";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", color=" + color + "]";
	}
	
	
	
}
