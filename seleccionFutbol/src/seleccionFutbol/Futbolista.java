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
	}
	public void viajar() {
	}
	public void entrenar() {
	}
	public void jugarPartido() {
	}
	public void entrevista() {
		
	}
}
