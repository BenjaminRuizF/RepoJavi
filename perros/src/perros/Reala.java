package perros;

public class Reala {
	private perros[] array;

	public Reala() {
		array = null;
	}

	public void aniadirPerro(perros P) {
		if (P.getEdad() <= 1 || P.getEdad() >= 7
				|| (!"galgo".equalsIgnoreCase(P.getRaza()) && !"cocker".equalsIgnoreCase(P.getRaza()))) {
			System.out.println("Perro no añadido");
			return;
		}
		if (array == null) {
			array = new perros[1];
			array[0] = P;
		} else {
			perros[] aux = new perros[array.length + 1];
			System.arraycopy(array, 0, aux, 0, array.length);
			aux[array.length] = P;
			array = aux;
		}
	}

	public void mostrarPerros() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
	}

	public void sacarPerros(int n) {
		if (array == null || array.length < n) {
			// no se puede sacar
			return;
		}
		if (array.length == n) {
			array = null;
		}
		perros[] aux = new perros[array.length - n];
		System.arraycopy(array, 0, aux, 0, array.length - n);
		array = aux;
	}
}
