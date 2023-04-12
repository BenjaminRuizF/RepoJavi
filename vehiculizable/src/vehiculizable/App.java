package vehiculizable;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moto m1 = new Moto("Honda",125);
		Coche c1 = new Coche("Renault", 2000);
		m1.acelerar(50);
		m1.acelerar(60);
		System.out.println(m1.acelerar(5));
		System.out.println(m1.acelerar(20));
		System.out.println(m1.frenar(40));
	}

}
