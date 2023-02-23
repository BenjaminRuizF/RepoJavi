package concesionario;

public class CocheElectrico extends VehiculosNoMotorizados {
	private String marca_bateria;

	public CocheElectrico() {
		super();
		setRuedas(4);
		setAsiento(2);
		marca_bateria = "";
		// TODO Auto-generated constructor stub
	}

	public CocheElectrico(String marca, String color, int ruedas, int asiento, String marca_bateria) {
		super(marca, color, ruedas, asiento);
		this.marca_bateria = marca_bateria;
		// TODO Auto-generated constructor stub
	}

	public CocheElectrico(String marca, String color) {
		super(marca, color);
		setRuedas(4);
		setAsiento(2);
		marca_bateria = "";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Esto es un Coche Electrico con marca de bateria " + marca_bateria + " tiene "+getRuedas()+" ruedas y "+getAsiento()+" asientos y la marca es"+getMarca();
	}

	public String getMarca_bateria() {
		return marca_bateria;
	}

	public void setMarca_bateria(String marca_bateria) {
		this.marca_bateria = marca_bateria;
	}
	
}
