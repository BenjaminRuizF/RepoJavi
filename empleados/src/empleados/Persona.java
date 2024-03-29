package empleados;

public abstract class Persona {
	private String Nombre;
	private int Edad;
	private double Salario;
	private static final int PLUS = 300;
	public Persona(String nombre, int edad, double salario) {
		Nombre = nombre;
		Edad = edad;
		Salario = salario;
	}
	public String getNombre() {
		return Nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public static int getPlus() {
		return PLUS;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	public abstract boolean plus();
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Edad=" + Edad + ", Salario=" + Salario + "]";
	}


	
}
