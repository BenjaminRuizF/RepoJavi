package empleados;

public class Comercial extends Persona{
	private double comision;

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return super.toString()+" Soy Comercial [comision=" + comision + "]";
	}


	public boolean plus() {
		if(getEdad() > 30 && comision >200) {
			setSalario(getSalario() + comision +getPlus());
			return true;
		}else setSalario(getSalario()+comision);
			return false;
	}

	
}
