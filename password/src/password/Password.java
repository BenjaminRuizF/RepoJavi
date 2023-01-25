package password;

public class Password {
	private int longitud;
	private String contrasenia;
	public Password() {
		longitud = 8;
		contrasenia = generarPassword();
	}
	public Password(int longitud) {
		this.longitud = longitud;
		contrasenia = generarPassword();
	}
	public String generarPassword(){
		
		return "hola";
	}
	
}
