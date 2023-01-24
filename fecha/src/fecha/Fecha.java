package fecha;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	private boolean bisiesto = esBisiesto();

	public Fecha() {
		anio = 1;
		mes = 1;
		dia = 1;
	}

	public Fecha(int anio, int mes, int dia) {
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean fechaCorrecta() {
		if (anio < 0) {
			return false;
		}
		if (mes < 1 || mes > 12) {
			return false;
		}
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia > 31 || dia < 1) {
				return false;
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia > 30 || dia < 1) {
					return false;
				}
			}
		}
		if (mes == 2 && bisiesto == true) {
			if (dia > 29 || dia < 1) {
				return false;
			} else if (mes == 2 && bisiesto == false) {
				if (dia > 28 || dia < 1) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean esBisiesto() {
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			return true;
		else
			return false;
	}

	public void diaSiguiente() {

		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) && dia == 31) {
			dia = 1;
			mes++;

		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30) {
			dia = 1;
			mes++;
		} else if (mes == 2 && bisiesto == true && dia == 29) {
			dia = 1;
			mes++;
		} else if (mes == 2 && bisiesto == false && dia == 28) {
			dia = 1;
			mes++;
		} else if (mes == 12 && dia == 31) {
			dia = 1;
			mes = 1;
			anio++;
		} else
			dia++;

	}

	@Override
	public String toString() {
		String Dia = "0" + dia;
		String Mes = "0" + mes;
		if (mes < 10 && dia < 10) {
			return Dia + "-" + Mes + "-" + anio;
		}
		if (dia < 10) {
			return Dia + "-" + mes + "-" + anio;
		}
		if (mes < 10) {
			return dia + "-" + Mes + "-" + anio;
		}
		return dia + "-" + mes + "-" + anio;
	}

}
