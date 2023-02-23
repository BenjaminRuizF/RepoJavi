package tiendaDeGuitarras;

public class Tienda {
	private double Capital;
	private Guitarra[] Stock;

	public Tienda(double Capital) {

		this.Capital = Capital;
	}

	public void comprarGuitarra(Guitarra G) {
		if (Capital < G.getPrecio()) {
			System.err.println("Capital insuficiente");
			return;
		} else {
			Capital-=G.getPrecio();
			if (Stock == null) {
				Stock = new Guitarra[1];
				Stock[0] = G;
				return;
			} else {
				Guitarra[] aux = new Guitarra[Stock.length + 1];
				System.arraycopy(Stock, 0, aux, 0, Stock.length);
				aux[Stock.length] = G;
				Stock = aux;
			}
		}

	}
	public void venderGuitarra(Guitarra G) {
		if (Stock == null) {
			System.err.println("Sin stock");
			return;
		} else
		for (int i = 0; i < Stock.length; i++) {
			if(Stock[i].getID().equalsIgnoreCase(G.getID())) {
				Stock[i]=null;
				Capital+=Stock[i].getPrecio();
			}
		}
	}
	public void mostrarGuitarra(){
		if (Stock == null) {
			System.err.println("Sin stock");
			return;
		} else
		for (int i = 0; i < Stock.length; i++) {
			System.out.println(Stock[i].toString()+"\n");
		}
	}

	public double getCapital() {
		return Capital;
	}
}
