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
		return super.toString()+"Repartidor [zona=" + zona + "]";
	}
	public void plus(Repartidor r) {
		if(r.getEdad()<25&&r.getZona().equalsIgnoreCase("zona 3")) {
			r.setSalario(getSalario()+r.getPlus());
		}
	}


}
