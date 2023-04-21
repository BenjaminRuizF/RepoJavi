package relaciones;

public class Montaña implements Relaciones{
	private String nombre;
	private double altitud;
	 
	@Override
	public boolean esMayor(Object b) {
		if(b instanceof Montaña) {
			Montaña m = (Montaña)b;
			return this.altitud>m.altitud;
		}
		return false;
	}
	@Override
	public boolean esMenor(Object b) {
		if(b instanceof Montaña) {
			Montaña m = (Montaña)b;
			return this.altitud<m.altitud;
		}
		return false;
	}
	@Override
	public boolean esIgual(Object b) {
		if(b instanceof Montaña) {
			Montaña m = (Montaña)b;
			return this.altitud==m.altitud;
		}
		return false;
	}
}
