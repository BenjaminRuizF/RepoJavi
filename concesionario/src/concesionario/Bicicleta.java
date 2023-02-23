package concesionario;

public class Bicicleta extends VehiculosNoMotorizados{

	public Bicicleta(String marca, String color) {
		super(marca, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Esta es una bicicleta de color "+getColor();
	}
	
}
