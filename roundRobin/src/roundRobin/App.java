package roundRobin;

public class App {

	public static void main(String[] args) {
		CPU c1 = new CPU(5);
		c1.encolar(new Proceso(1, 15));
		c1.encolar(new Proceso(2, 7));
		c1.encolar(new Proceso(3, 20));
		c1.encolar(new Proceso(4, 12));
		c1.encolar(new Proceso(5, 5));
		c1.encolar(new Proceso(6, 15));
		c1.run();

	}

}
