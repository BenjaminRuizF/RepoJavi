package vehiculizable;

public class Coche implements vehiculizable{
	
	private String marca;
	private int vel_act;
	private int cc;
	
	
	public Coche(String marca, int cc) {
		this.marca = marca;
		this.cc = cc;
		vel_act = 0;
	}

	public String acelerar(int v) {
		if (vel_act + v <= VEL_MAX) {
			vel_act += v;
			return "El coche a acelerado " + v + " y ahora va a " + vel_act;
		} else
			vel_act += v;
		return "Exceso de velocidad";
	}

	public String frenar(int v) {
		if (vel_act - v <= 0) {
			vel_act = 0;
			return "El coche esta parada";
		}
		vel_act -= v;
		if (vel_act > VEL_MAX) {
			return "Exceso de velocidad";
		} else
			return "Se ha frenado " + v + " el coche va a " + vel_act;
	}
}
