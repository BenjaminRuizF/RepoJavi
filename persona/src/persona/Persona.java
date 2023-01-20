package persona;

public class Persona {
	public final char SEXO = 'M';
	private final int DELGADO = -1;
	private final int SOBREPESO = 1;
	private final int IDEAL = 0;
	private char sexo;
	private String nombre;
	private String DNI;
	private int edad;
	private double peso;
	private double altura;

	public Persona() {
		this.sexo = SEXO;
		this.nombre = "Pepe";
		this.edad = 0;
		this.DNI = generarDNI();
		this.peso = 0.00;
		this.altura = 0.00;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.sexo = sexo;
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = generarDNI();
		this.peso = 0.00;
		this.altura = 0.00;
	}

	public Persona(String nombre, int edad, char sexo, String DNI, double peso, double altura) {
		this.sexo = sexo;
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.peso = peso;
		this.altura = altura;
	}
	private String generarDNI() {
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        int num=(int)(Math.random()*99999999);
        return Integer.toString(num)+letras.charAt(num%23);
		}
	public int calculadoraIMC() {
		double imc = peso/(altura*altura);
		if (imc<20) {
			return DELGADO;
		}
		if (imc>25) {
			return SOBREPESO;
		}
		return IDEAL;
	}
	public boolean esMayorDeEdad() {
		return edad>=18;
	}
	private char comprobarSexo(char sexo) {
		if (sexo!= 'H') {
			sexo=SEXO;
		}
		return sexo;
	}

	@Override
	public String toString() {
		return "Persona [sexo=" + sexo + ", nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = comprobarSexo(sexo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getDNI() {
		return DNI;
	}
	
}
