package centroEducativo;

public class Mantenimiento extends Persona{
	private String especialidad;

	public Mantenimiento(String nombre, int edad, String dNI, String especialidad) {
		super(nombre, edad, dNI);
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return super.toString()+ "Mantenimiento [especialidad=" + especialidad + "]";
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	 
}
