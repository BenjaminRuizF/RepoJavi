package concesionario;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicicleta B1 = new Bicicleta("BH", "azul");
		CocheElectrico C1 = new CocheElectrico();
		C1.setColor("Rosa");
		C1.setMarca("tesla");
		C1.setMarca_bateria("DuraMucho");
		Triciclo T1 = new Triciclo();
		System.out.println(T1.toString());
		System.out.println(C1.toString());
		System.out.println(B1.toString());
	}

}
