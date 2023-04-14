package arraysReales;

public class App {

	public static void main(String[] args) {
		double[] array= {20,2,3,4,5,6,7,8,9,10};
			
		ArraysReales a1 = new ArraysReales(array);
		System.out.println(a1.maximo());
		System.out.println(a1.minimo());
		System.out.println(a1.sumatorio());
		Persona[] arrayPersonas = new Persona[5];
		arrayPersonas[0] = new Persona(2000, "Paco");
		arrayPersonas[1] = new Persona(2500, "Pedro");
		arrayPersonas[2] = new Persona(1200, "Maria");
		arrayPersonas[3] = new Persona(1800, "Antonio");
		arrayPersonas[4] = new Persona(1450.5, "David");
		GrupoPersona g1 = new GrupoPersona(arrayPersonas);
		System.out.println(g1.maximo());
		System.out.println(g1.minimo());
		System.out.println(g1.sumatorio());
		
	}

}
