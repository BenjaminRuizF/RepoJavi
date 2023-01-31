package password;

public class Password {
	private int longitud;
	private String contrasenia;

	public Password() {
		longitud = 8;
		generarPassword();
	}

	public Password(int longitud) {
		if (longitud > 8) {
			this.longitud = longitud;
		} else
			this.longitud = 8;
		generarPassword();
	}

	public boolean esFuerte() {
		int contadorMayus = 0;
		int contadorMinus = 0;
		int contadorNum = 0;
		String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String minusculas = "abcdefghijklmnopqrstuvwxyz";
		String numeros = "123456789";
		for (int i = 0; i < contrasenia.length(); i++) {
			for (int j = 0; j < mayusculas.length(); j++) {
				if (contrasenia.charAt(i) == mayusculas.charAt(j)) {
					contadorMayus++;
				}
			}
		}
		for (int i = 0; i < contrasenia.length(); i++) {
			for (int j = 0; j < minusculas.length(); j++) {
				if (contrasenia.charAt(i) == minusculas.charAt(j)) {
					contadorMinus++;
				}
			}
		}
		for (int i = 0; i < contrasenia.length(); i++) {
			for (int j = 0; j < numeros.length(); j++) {
				if (contrasenia.charAt(i) == numeros.charAt(j)) {
					contadorNum++;
				}
			}
		}
		if (contadorMayus > 2 && contadorMinus > 1 && contadorNum > 5) {
			return true;
		}
		return false;
	}

	public void generarPassword() {
		contrasenia="";
		while (contrasenia.length() < longitud) {
			contrasenia += Character.toString((int) (Math.random() * (132 - 32 + 1) + 32));
		}
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		if(longitud>8)
		this.longitud = longitud;
		generarPassword();
	}

	public String getContrasenia() {
		return contrasenia;
	}

}
