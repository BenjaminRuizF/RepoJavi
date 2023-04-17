package arraysReales;

public class GrupoPersona implements Estadisticas {
	private Persona[] array;
	private final double MINIMO = Double.MIN_VALUE;
	private final double MAXIMO = Double.MAX_VALUE;
	public GrupoPersona() {
		this.array = new Persona[5];
		array[0] = new Persona(2000, "Paco");
		array[1] = new Persona(2500, "Pedro");
		array[2] = new Persona(1200, "Maria");
		array[3] = new Persona(1800, "Antonio");
		array[4] = new Persona(1450.5, "David");
	}

	@Override
	public double minimo() {
		double num = MAXIMO;
		for (int i = 0; i < array.length; i++) {
			if(array[i].getDinero()<num) {
				num = array[i].getDinero();
			}
		}
		return num;
	}
	@Override
	public double maximo() {
		double num = MINIMO;
		for (int i = 0; i < array.length; i++) {
			if(array[i].getDinero()>num) {
				num = array[i].getDinero();
			}
		}
		return num;
	}

	@Override
	public double sumatorio() {
		int num = 0 ;
		for (int i = 0; i < array.length; i++) {
			num +=array[i].getDinero();
		}
		return num;
	}
	
}
