package centroEducativo;

public class Profesor extends Persona{
	private String seminario;

	public Profesor(String nombre, int edad, String dNI, String seminario) {
		super(nombre, edad, dNI);
		this.seminario = seminario;
	}

	@Override
	public String toString() {
		return super.toString() +"Profesor [seminario=" + seminario + "]";
	}

	public String getSeminario() {
		return seminario;
	}

	public void setSeminario(String seminario) {
		this.seminario = seminario;
	}
	
	
}
