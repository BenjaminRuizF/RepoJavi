package seleccionFutbol;

public class Entrenador extends SeleccionFutbol implements IntegranteSeleccionFutbol{
	private int idFederacion;

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}
	
	public void concentrarse() {
	}
	public void viajar() {
	}
	public void entrenar() {
	}
	public void jugarPartido() {
	}
	public void planificarEntrenamiento() {
		
	}
}
