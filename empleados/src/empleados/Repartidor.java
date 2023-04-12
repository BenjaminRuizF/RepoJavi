package empleados;

public class Repartidor extends Persona{
	private String zona;

	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return super.toString()+" Soy Repartidor [zona=" + zona + "]";
	}
	public boolean plus() {
		if(getEdad()<25&&"zona 3".equalsIgnoreCase(getZona())) {
			setSalario(getSalario()+getPlus());
			return true;
		}
		return false;
	}

	


}
