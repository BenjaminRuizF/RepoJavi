package cuenta;

public class App {

	public static void main(String[] args) {
		Cuenta C1 = new Cuenta();
		Cuenta C2 = new Cuenta("Federico", "5678954321", 3, 2000);
		Cuenta C3 = new Cuenta("Carlos", "344567821", 3, 2500);
		C1.setNombreCliente("Pedro");
		C1.setNumeroCuenta("1234567892");
		C1.setTipoInteres(0);
		C1.setSaldo(2000);
		C1.ingresar(200);
		System.out.println(C1.getSaldo());
		C2.retirar(500);
		System.out.println(C2.getSaldo());
		C3.transferencia(C1, 1000);
		System.out.println(C1.getSaldo() +" "+C3.getSaldo());
	}

}
