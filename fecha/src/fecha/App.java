package fecha;

public class App {

	public static void main(String[] args) {
		Fecha F1 = new Fecha();
		Fecha F2 = new Fecha(2000,12,31);
		F1.setAnio(2020);
		F1.setMes(1);
		F1.setDia(1);
		comprobacion(F1);
		comprobacion(F2);
		while (F1.getAnio()!=2021) {
			F1.diaSiguiente();
			System.out.println(F1.toString());
		}
		
	}
	public static void comprobacion(Fecha F) {
		if (F.fechaCorrecta()== false) {
			System.err.println("La fecha "+F+" es erronea");
			System.exit(0);
		}
		return;
	}
}
