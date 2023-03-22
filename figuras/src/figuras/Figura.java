package figuras;

public abstract class Figura {
	private int lados;
	private int id_figura;

	abstract public double calcularArea();

	abstract public double calcularPerimetro();

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public int getId_figura() {
		return id_figura;
	}

	public void setId_figura(int id_figura) {
		this.id_figura = id_figura;
	}

	public Figura(int lados, int id_figura) {
		this.lados = lados;
		this.id_figura = id_figura;
	}

	@Override
	public String toString() {
		return "Figura [lados=" + lados + ", id_figura=" + id_figura + "]";
	}

}
