package arraysReales;

public class Persona {
	private double dinero;
	private String nombre;
	public Persona(double dinero, String nombre) {
		this.dinero = dinero;
		this.nombre = nombre;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
