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
		return super.toString()+"Comercial [comision=" + comision + "]";
	}


	@Override
	public void plus() {
		if(c.getEdad() > 30 && comision >200) {
			double salario = c.getSalario() + comision +c.getPlus();
			c.setSalario(salario);
		}else c.setSalario(getSalario()+comision);
	}
}
