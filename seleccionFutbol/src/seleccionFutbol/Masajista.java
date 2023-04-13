package seleccionFutbol;

public class Masajista extends SeleccionFutbol implements IntegranteSeleccionFutbol{
	private String titulacion;
	private int aniosExperiencia;
	public String getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	public void concentrarse() {
		System.out.println("El masajista se esta concentrando");
	}
	public void viajar() {
		System.out.println("El masajista esta viajando");
	}
	public void entrenar() {
		System.out.println("El masajista esta viendo el entrenamiento");
	}
	public void jugarPartido() {
		System.out.println("El masajista esta preparado para salir a asistir a un jugador");
	}
	public void darMasaje() {
		System.out.println("El masajista esta dando un masaje");
	}
	@Override
	public String toString() {
		return "Masajista  "+ super.toString()+"  [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
	}
	
	
}
