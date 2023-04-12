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
	}
	public void viajar() {
	}
	public void entrenar() {
	}
	public void jugarPartido() {
	}
	public void darMasaje() {
		
	}
	
}
