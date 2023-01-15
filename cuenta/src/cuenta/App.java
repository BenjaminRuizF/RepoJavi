package cuenta;

public class App {

	public static void main(String[] args) {
		Cuenta C1 = new Cuenta();
		Cuenta C2 = new Cuenta("Federico", "5678954321", 3, 12);
		C1.setNombreCliente("Pedro");
		C1.setNumeroCuenta("1234567892");
		C1.setTipoInteres(0);
		C1.setSaldo(2000);
		C1.controlDeErrores();
		C2.controlDeErrores();
		System.out.println(C1.toString());
		System.out.println(" ");
		System.out.println(C2.toString());
		System.out.println(" ");
		C1.ingreso(200);
		System.out.println(C1.getSaldo());
		C1.retirar(2000);
		System.out.println(C1.getSaldo());
	}

}
