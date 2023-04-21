package relaciones;

public class Persona implements Relaciones {
	private String nombre;
	private int edad;
	@Override
	public boolean esMayor(Object b) {
		if(b instanceof Persona) {
			Persona p = (Persona)b;
			return this.edad>p.edad;
		}
		return false;
	}

	@Override
	public boolean esMenor(Object b) {
		if(b instanceof Persona) {
			Persona p = (Persona)b;
			return this.edad<p.edad;
		}
		return false;
	}

	@Override
	public boolean esIgual(Object b) {
		if(b instanceof Persona) {
			Persona p = (Persona)b;
			return this.edad==p.edad;
		}
		return false;
	}

}
