package bebidas;

public class Agua extends Bebidas {

	private String origen;

	public Agua(int id, double litros, double precio, String marca, String origen) {
		super(id, litros, precio, marca);
		this.origen = origen;
	}

	@Override
	public String toString() {
		return super.toString()+"Soy Agua y tengo origen "+origen;
	}

	public String getOrigen() {
		return origen;
	}
	
	
}

