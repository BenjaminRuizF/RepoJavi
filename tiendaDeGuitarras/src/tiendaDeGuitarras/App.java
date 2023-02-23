package tiendaDeGuitarras;

public class App {

	public static void main(String[] args) {
		Tienda T = new Tienda(2000);
		Guitarra G1 = new Guitarra("9999", "Negra", 450.50, 7);
		Guitarra G2 = new Guitarra("8888", "Blanca", 2001, 5);
		System.out.println(T.getCapital());
		T.mostrarGuitarra();
		T.comprarGuitarra(G2);
		T.mostrarGuitarra();
		System.out.println(T.getCapital());
		T.venderGuitarra(G1);
		T.mostrarGuitarra();
	}

}
