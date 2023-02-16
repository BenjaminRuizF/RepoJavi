package tiendaDeGuitarras;

public class Guitarra {
	private String ID;
	private String Color;
	private double Precio;
	private int NumCuerdas;

	public Guitarra(String iD, String color, double precio, int numCuerdas) {
		this.ID = iD;
		this.Color = color;
		this.Precio = precio;
		this.NumCuerdas = numCuerdas;
	}

	public Guitarra() {
		this.ID = "00000";
		this.Color = "";
		this.Precio = 0.0;
		this.NumCuerdas = 0;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public int getNumCuerdas() {
		return NumCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		NumCuerdas = numCuerdas;
	}

	@Override
	public String toString() {
		return "Guitarra [ID=" + ID + ", Color=" + Color + ", Precio=" + Precio + ", NumCuerdas=" + NumCuerdas + "]";
	}

}
