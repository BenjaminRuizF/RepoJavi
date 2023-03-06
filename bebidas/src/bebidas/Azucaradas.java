package bebidas;

public class Azucaradas extends Bebidas{
	private int azucar;
	private boolean promo;
	public Azucaradas(int id, double litros, double precio, String marca, int azucar, boolean promo) {
		super(id, litros, precio, marca);
		this.azucar = azucar;
		this.promo = promo;
		if(promo) {
			precio*=0.9;
		}
	}
	public int getAzucar() {
		return azucar;
	}
	public boolean isPromo() {
		return promo;
	}
	@Override
	public String toString() {
		return super.toString()+"Soy azucarada y tengo [azucar=" + azucar + ", promo=" + promo + "]";
	}
	
}
