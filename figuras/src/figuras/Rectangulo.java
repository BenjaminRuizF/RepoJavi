package figuras;

public class Rectangulo extends Figura {
	private double base;
	private double altura;
	private int id_rectangulo;

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public int getId_rectangulo() {
		return id_rectangulo;
	}

	public Rectangulo(int lados, int id_figura, double base, double altura, int id_rectangulo) {
		super(lados, id_figura);
		this.base = base;
		this.altura = altura;
		this.id_rectangulo = id_rectangulo;
	}

	public double calcularArea() {
		return base * altura;
	}

	public double calcularPerimetro() {
		return (altura * 2) + (base * 2);
	}

	@Override
	public String toString() {
		return super.toString() + "Rectangulo [base=" + base + ", altura=" + altura + ", id_rectangulo=" + id_rectangulo
				+ "]";
	}

}
