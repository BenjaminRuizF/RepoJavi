package viajeros;

import java.util.Arrays;

public class Viajeros {
	private String DNI;
	private String Nombre;
	private String Apellidos;
	private String Nacionalidad;
	private String Direccion;
	private String info = this.DNI+" "+this.Nombre+" "+this.Apellidos+" "+this.Nacionalidad+" "+this.Direccion;

	public Viajeros() {
		DNI = "00000000X";
		Nombre = "Tu nombre";
		Apellidos = "Tus apellidos";
		Nacionalidad = "Tu nacionalidad";
		Direccion = "Tu direccion";
		
	}

	public Viajeros(String DNI, String Nombre, String Apellidos, String Nacionalidad, String Direccion) {
		this.DNI = DNI;
		this.Direccion = Direccion;
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Nacionalidad = Nacionalidad;
		info = this.DNI+" "+this.Nombre+" "+this.Apellidos+" "+this.Nacionalidad+" "+this.Direccion;
		
	}

	public void controlDeErrores() {
		int numDNI = Integer.parseInt(this.DNI.substring(0, 8));
		String letraDNI = this.DNI.substring(8);
		letraDNI.toUpperCase();
		
		if (letraDNI == "I"||letraDNI == "O"||letraDNI == "U"|| letraDNI == "Ñ") {
			System.err.println("La letra del DNI es incorrecta");
			return;
		}
	}
	public String getNombre() {return this.Nombre;}
	public String getApellidos(){return this.Apellidos;}
	public String getNacionalida() {return this.Nacionalidad;}
	public String getDNI(){return this.DNI;}
	public String getDireccion(){return this.Direccion;}
	
	public void setDireccion(String Direccion){this.Direccion=Direccion;}
	public void setNombre(String Nombre){this.Nombre=Nombre;}
	public void setApellidos(String Apellidos){this.Apellidos=Apellidos;}
	public void setNacionalidad(String Nacionalidad){this.Nacionalidad=Nacionalidad;}
	public void setDNI(String DNI){this.DNI=DNI;} 
	public void setInfo(String DNI, String Nombre, String Apellidos, String Nacionalidad, String Direccion) {info = this.DNI+" "+this.Nombre+" "+this.Apellidos+" "+this.Nacionalidad+" "+this.Direccion;}
	
	public String getInfo() {
		return info;
	}

	
	

}
