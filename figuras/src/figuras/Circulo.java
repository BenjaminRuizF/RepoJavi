package figuras;

public final class Circulo extends Elipse{
	private int id_circulo;

	public Circulo(int lados, int id_figura, double radio1, double radio2, int id_circulo) {
		super(lados, id_figura, radio1, radio2);
		this.id_circulo = id_circulo;
	}

	@Override
	public String toString() {
		return super.toString()+"Circulo [id_circulo=" + id_circulo + "]";
	}

	public int getId_circulo() {
		return id_circulo;
	}
	
	
	
}
