package electrodomesticos;

public class App {

	public static void main(String[] args) {
		Electrodomesticos[] e1 = new Electrodomesticos[6];
		e1[0] = new Lavadora();
		e1[1] = new Lavadora(325, 22);
		e1[2] = new Lavadora(435, 25, 'A', "Azul", 8);

		e1[3] = new Television();
		e1[4] = new Television(450, 12);
		e1[5] = new Television(560, 17, 'G', "negro", 50, true);

		for (int i = 0; i < e1.length; i++) {
			System.out.println(e1[i].precioFinal());
		}

		double precioLavadoras = 0.0;
		double precioTelevisiones = 0.0;
		double precioElectrodomesticos = 0.0;

		for (int i = 0; i < e1.length; i++) {
			if (e1[i] instanceof Television) {
				precioTelevisiones += e1[i].precioFinal();
			}
			if (e1[i] instanceof Lavadora) {
				precioLavadoras += e1[i].precioFinal();
			}
			if (e1[i] instanceof Electrodomesticos) {
				precioElectrodomesticos += e1[i].precioFinal();
			}
		}
		System.out.println(precioTelevisiones);
		System.out.println(precioLavadoras);
		System.out.println(precioElectrodomesticos);
	}

}
