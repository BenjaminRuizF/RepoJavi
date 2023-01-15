package cuenta;

public class Cuenta {
	private String nombreCliente;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	private String info;

	public Cuenta() {
		nombreCliente = "Paco";
		numeroCuenta = "0000000000";
		tipoInteres = 0.00;
		saldo = 0.00;

	}

	public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
		super();
		this.nombreCliente = nombreCliente;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		info = "El titular de la cuenta es " + nombreCliente + "\n El numero de la cuenta es " + numeroCuenta
				+ "\n El interes es de " + tipoInteres + " € \n Tu saldo es de " + saldo + " €";
		return info;
	}

	public void controlDeErrores() {
		if (saldo < 0) {
			System.err.println("No puedes estar en numeros negativos");
		}
		if (numeroCuenta.length() != 10) {
			System.err.println("Numero de cuenta invalido");
		}
	}

	public boolean ingreso(double ingresos) {
		if (ingresos < 0) {
			System.err.println("No puedes ingresar en negativo");
			return false;
		}
		saldo += ingresos;
		System.out.println("Saldo actualizado");
		return true;
	}

	public boolean retirar(double retirada) {
		if (retirada > saldo) {
			System.err.println("No tienes suficiente saldo");
			return false;
		}
		saldo -= retirada;
		System.out.println("Saldo actualizado");
		return true;
	}

	/*public void transferencia(double transferencia) {
		if (transferencia > ) {
			System.err.println("No hay suficiente saldo para hacer la transferencia");
		}
	
		System.out.println("Saldo actualizado");
	}*/
}
