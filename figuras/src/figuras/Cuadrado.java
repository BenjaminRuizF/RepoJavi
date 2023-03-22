package figuras;

public final class Cuadrado extends Rectangulo{
	private int id_cuadrado;

	public Cuadrado(int lados, int id_figura, double base, double altura, int id_rectangulo, int id_cuadrado) {
		super(lados, id_figura, base, altura, id_rectangulo);
		this.id_cuadrado = id_cuadrado;
	}

	public int getId_cuadrado() {
		return id_cuadrado;
	}

	@Override
	public String toString() {
		return super.toString()+"Cuadrado [id_cuadrado=" + id_cuadrado + "]";
	}
	
}
