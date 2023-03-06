package electrodomesticos;

public class Electrodomesticos {
	private final int PRECIOBASE = 100;
	private final int PESO = 5;
	private final char CONSUMO = 'F';
	private final String COLOR = "blanco";
	private int precioBase;
	private int peso;
	private char consumo;
	private String color;

	public Electrodomesticos() {
		this.precioBase = PRECIOBASE;
		this.peso = PESO;
		this.color = COLOR;
		this.consumo = CONSUMO;

	}

	public Electrodomesticos(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR;
		this.consumo = CONSUMO;
	}

	public Electrodomesticos(int precioBase, int peso, char consumo, String color) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.consumo = consumo;
		this.color = color;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public char getConsumo() {
		return consumo;
	}

	public String getColor() {
		return color;
	}

	public char comprobarConsumoEnergetico(char letra) {
		if (!Character.toString(letra).matches("[a-f]")) {
			letra = CONSUMO;
			return letra;
		} else
			return letra;
	}

	public String comprobarColor(String color) {
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("negro")
				|| color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul")) {
			return color;
		} else
			color = COLOR;
		return color;
	}

	public int precioFinal() {
		int precio =0;
		switch (consumo) {
		case 'A':
			precio += 100;
			break;
		case 'B':
			precio += 80;
			break;
		case 'C':
			precio += 60;
			break;
		case 'D':
			precio += 50;
			break;
		case 'E':
			precio += 30;
			break;
		case 'F':
			precio += 10;
			break;
		default:
			break;
		}
		switch ((peso >= 0 && peso <= 19) ? 0 : (peso >= 20 && peso <= 49) ? 1 : (peso >= 50 && peso <= 79) ? 2 : 3) {
		case 0:
			precio += 10;
			break;
		case 1:
			precio +=50;
			break;
		case 2:
			precio +=80;
			break;
		case 3:
			precio +=100;
			break;
		default:
			break;
		}
		return precioBase+ precio;
	}
}
