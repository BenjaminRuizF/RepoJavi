package seleccionFutbol;

public class Futbolista extends SeleccionFutbol implements IntegranteSeleccionFutbol{
	private int dorsal;
	private String demarcacion;
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getDemarcacion() {
		return demarcacion;
	}
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
	
	public void concentrarse() {
		System.out.println("El jugador se esta concentrando");
	}
	public void viajar() {
		System.out.println("El jugador esta viajando");
	}
	public void entrenar() {
		System.out.println("El jugador esta entrenando");
	}
	public void jugarPartido() {
		System.out.println("El jugador esta jugando el partido");
	}
	public void entrevista() {
		System.out.println("El jugador esta en una entrevista");
	}
	@Override
	public String toString() {
		return "Futbolista "+ super.toString()+" [dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
	}
	
}
