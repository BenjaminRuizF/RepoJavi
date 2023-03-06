package bebidas;

public abstract class Bebidas {
	private int id;
	private double litros;
	protected double precio;
	private String marca;

	public Bebidas(int id, double litros, double precio, String marca) {
		super();
		this.id = id;
		this.litros = litros;
		this.precio = precio;
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public double getLitros() {
		return litros;
	}

	public double getPrecio() {
		return precio;
	}

	public String getMarca() {
		return marca;
	}

}
