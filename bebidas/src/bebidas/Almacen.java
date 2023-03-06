package bebidas;

public class Almacen {
	Bebidas[][] estanterias;

	public Almacen() {
		super();
		this.estanterias = new Bebidas[5][5];
	}
	public double calcularPrecioTotal() {
		double total = 0.0;
		for (int i = 0; i < estanterias.length; i++) {
			for (int j = 0; j < estanterias[0].length; j++) {
				if(estanterias[i][j]==null)
					continue;
				total+=estanterias[i][j].getPrecio();
			}
		}
		return total;
	}
	public double calcularPrecioMarca(String marca) {
		double total = 0.0;
		for (int i = 0; i < estanterias.length; i++) {
			for (int j = 0; j < estanterias[0].length; j++) {
				if(estanterias[i][j].getMarca().equalsIgnoreCase(marca))
					continue;
				total+=estanterias[i][j].getPrecio();
			}
		}
		return total;
	}
	public int calcularPrecioEstanteria(int num) {
		double total = 0.0;
		
		for (int i = 0; i < estanterias[num].length; i++) {
			
		}
	}
}
