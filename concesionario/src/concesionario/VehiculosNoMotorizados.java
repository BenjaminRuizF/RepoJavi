package concesionario;

public class VehiculosNoMotorizados {
	private String marca;
	private String color;
	private int ruedas;
	private int asiento;

	public VehiculosNoMotorizados() {
		this.marca = "";
		this.color = "";
		this.ruedas = 2;
		this.asiento = 1;
	}

	public VehiculosNoMotorizados(String marca, String color) {
		this.marca = marca;
		this.color = color;
		this.ruedas = 2;
		this.asiento = 1;
	}

	public VehiculosNoMotorizados(String marca, String color, int ruedas, int asiento) {
		this.marca = marca;
		this.color = color;
		this.ruedas = ruedas;
		this.asiento = asiento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	@Override
	public String toString() {
		return "La descripción es: Este es un vehiculo no motorizado  con color " + color + " ,  con " + ruedas
				+ " ruedas y con " + asiento + "  asientos ";
	}

}
