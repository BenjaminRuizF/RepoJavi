package vehiculizable;

public class Moto implements vehiculizable {
	private String marca;
	private int cil;
	private int vel_act;

	public Moto(String marca, int cil) {
		this.marca = marca;
		this.cil = cil;
		this.vel_act = 0;
	}

	public String acelerar(int v) {
		if (vel_act + v <= VEL_MAX) {
			vel_act += v;
			return "La moto a acelerado " + v + " y ahora va a " + vel_act;
		} else
			vel_act += v;
		return "Exceso de velocidad";
	}

	public String frenar(int v) {
		if (vel_act - v <= 0) {
			vel_act = 0;
			return "La moto esta parada";
		}
		vel_act -= v;
		if (vel_act > VEL_MAX) {
			return "Exceso de velocidad";
		} else
			return "Se ha frenado " + v + " la moto va a " + vel_act;
	}
}
