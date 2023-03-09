package electrodomesticos;

public class Electrodomesticos {
	private final double PRECIOBASE = 100;
	private final int PESO = 5;
	private final char CONSUMO = 'F';
	private final String COLOR = "blanco";
	private double precioBase;
	private double precio;
	private int peso;
	private char consumo;
	private String color;

	public Electrodomesticos() {
		this.precioBase = PRECIOBASE;
		this.peso = PESO;
		this.color = COLOR;
		this.consumo = CONSUMO;

	}

	public Electrodomesticos(double precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR;
		this.consumo = CONSUMO;
	}

	public Electrodomesticos(double precioBase, int peso, char consumo, String color) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.consumo = consumo;
		this.color = color;
	}

	public double getPrecioBase() {
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

	public void comprobarConsumoEnergetico(char letra) {
		switch (letra) {
		case 'a':
		case 'A':
			this.consumo = letra;
			break;
		case 'b':
		case 'B':
			this.consumo = letra;
			break;
		case 'c':
		case 'C':
			this.consumo = letra;
			break;
		case 'd':
		case 'D':
			this.consumo = letra;
			break;
		case 'e':
		case 'E':
			this.consumo = letra;
			break;
		default: 
			this.consumo = CONSUMO;
			break;
		}
	}

	public void comprobarColor(String color) {
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("negro")
				|| color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul")) {
			this.color = color;
		} else
			this.color= COLOR;
	}

	public double precioFinal() {
		double devolver  = precioBase;
		switch (consumo) {
		case 'a':
		case 'A':
			devolver += 100;
			break;
		case 'b':
		case 'B':
			devolver += 80;
			break;
		case 'c':
		case 'C':
			devolver += 60;
			break;
		case 'd':
		case 'D':
			devolver += 50;
			break;
		case 'e':
		case 'E':
			devolver += 30;
			break;
		case 'F':
			devolver+= 10;
			break;
		default:
			break;
		}
		switch ((peso >= 0 && peso <= 19) ? 0 : (peso >= 20 && peso <= 49) ? 1 : (peso >= 50 && peso <= 79) ? 2 : 3) {
		case 0:
			devolver += 10;
			break;
		case 1:
			devolver +=50;
			break;
		case 2:
			devolver +=80;
			break;
		case 3:
			devolver +=100;
			break;
		default:
			break;
		}
		return devolver;
	}
}
