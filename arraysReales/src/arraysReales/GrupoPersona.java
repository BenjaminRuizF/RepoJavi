package arraysReales;

public class GrupoPersona implements Estadisticas {
	Persona[] array = new Persona[5];
	private final double MINIMO = Double.MIN_VALUE;
	private final double MAXIMO = Double.MAX_VALUE;
	public GrupoPersona(Persona[] array) {
		this.array = array;
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
