package electrodomesticos;

public class Lavadora extends Electrodomesticos {
	private int carga;
	private static final int CARGA = 5;

	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA;
	}

	public Lavadora(int precioBase, int peso, char consumo, String color, int carga) {
		super(precioBase, peso, consumo, color);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public double precioFinal() {
		if (carga > 30) {
			return super.precioFinal() + 50;
		}
		return super.precioFinal();
	}

}
