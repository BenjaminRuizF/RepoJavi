package viajeros;

public class App {

	public static void main(String[] args) {
		Viajeros V1 = new Viajeros();
		Viajeros V2 = new Viajeros("12345678U","Pepe", "Castillo Galan", "Español", "Camino de la muerte Nº666");
		Viajeros V3 = new Viajeros();
		/*System.out.println(V2.getDNI());
		System.out.println(V2.getNombre());
		System.out.println(V2.getApellidos());
		System.out.println(V2.getNacionalida());
		System.out.println(V2.getDireccion());*/
		
		
		V1.setNombre("Mr.West");
		V1.setApellidos("Kanie Frederick");
		V1.setNacionalidad("Flaquitolandia");
		V1.setDireccion("West Cementerio");
		
		/*System.out.println(V1.getDNI());
		System.out.println(V1.getNombre());
		System.out.println(V1.getApellidos());
		System.out.println(V1.getNacionalida());
		System.out.println(V1.getDireccion());*/
		System.out.println(V1.toString());
		System.out.println(" ");
		System.out.println(V2.toString());
		System.out.println(" ");
		System.out.println(V3.toString());
		System.out.println(V1.getContador());
	}

}
