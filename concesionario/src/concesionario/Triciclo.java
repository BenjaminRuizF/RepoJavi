package concesionario;

public class Triciclo extends VehiculosNoMotorizados {

	public Triciclo() {
		super();
		setRuedas(3);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "El triciclo es un vehiculo sin motor con "+getRuedas()+" ruedas "+super.toString();
	}

}
