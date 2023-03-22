package figuras;

public class Elipse extends Figura {
	private double radio1;
	private double radio2;
	private int id_elipse;

	public Elipse(int lados, int id_figura, double radio1, double radio2) {
		super(lados, id_figura);
		this.radio1 = radio1;
		this.radio2 = radio2;
	}

	public double calcularArea() {
		return radio1 * radio2 * Math.PI;
	}

	public double calcularPerimetro() {
		return (2 * Math.PI * Math.sqrt(Math.pow(radio1, 2) + Math.pow(radio2, 2))) / 2;
	}

	@Override
	public String toString() {
		return super.toString() + "Elipse [radio1=" + radio1 + ", radio2=" + radio2 + "]";
	}

	public double getRadio1() {
		return radio1;
	}

	public double getRadio2() {
		return radio2;
	}

	public int getId_elipse() {
		return id_elipse;
	}
	
}
