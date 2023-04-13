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
		System.out.println("El entrenador se esta concentrando");
	}
	public void viajar() {
		System.out.println("El entrenador esta viajando");
	}
	public void entrenar() {
		System.out.println("El entrenador esta entrenando a los jugadores");
	}
	public void jugarPartido() {
		System.out.println("El entrenador esta dirigiendo el partido");
	}
	public void planificarEntrenamiento() {
		System.out.println("El entrenador esta planificando el siguiente entrenamiento");
	}

	@Override
	public String toString() {
		return "Entrenador "+ super.toString()+"  [idFederacion=" + idFederacion + "]";
	}
	
}
