package electrodomesticos;

public class Television extends Electrodomesticos {
	private static final double RESOLUCION = 20;
	private static final boolean TDT = false;
	private double resolucion;
	private boolean tdt;

	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.tdt = TDT;
	}

	public Television(double precioBase, int peso, char consumo, String color, double resolucion, boolean tdt) {
		super(precioBase, peso, consumo, color);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	public Television(double precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION;
		this.tdt = TDT;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	public double precioFinal() {
		double devolver = super.precioFinal();
		if (resolucion > 40) {
			devolver *= 1.3;
		}
		if (isTdt()) {
			devolver += 50;
		}
		return devolver;
	}
}
