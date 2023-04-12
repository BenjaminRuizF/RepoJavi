package empleados;

public class App {

	public static void main(String[] args) {
		Repartidor r1 = new Repartidor("Pedro", 39,1200, "Zona 1");
		Repartidor r2 = new Repartidor("Pepe", 23,1100, "Zona 2");
		Repartidor r3 = new Repartidor("Juan", 20,1300, "Zona 3");
		Repartidor r4 = new Repartidor("Miguel", 29,1400, "Zona 4");
		Repartidor r5 = new Repartidor("Pedro", 20,1000, "Zona 3");
		
		Comercial c1 = new Comercial("Paco", 40, 1420, 400);
		Comercial c2 = new Comercial("Marta", 25, 1200, 100);
		Comercial c3 = new Comercial("Carlos", 27, 1300, 200);
		Comercial c4 = new Comercial("Pablo", 30, 1600, 300);
		Comercial c5 = new Comercial("Raul", 29, 1400, 500);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println(r4.toString());
		System.out.println(r5.toString());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c5.toString());
		
		System.out.println(r1.plus());
		System.out.println(r2.plus());
		System.out.println(r3.plus());
		System.out.println(r4.plus());
		System.out.println(r5.plus());
		System.out.println(c1.plus());
		System.out.println(c2.plus());
		System.out.println(c3.plus());
		System.out.println(c4.plus());
		System.out.println(c5.plus());
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println(r4.toString());
		System.out.println(r5.toString());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c5.toString());
	}

}
