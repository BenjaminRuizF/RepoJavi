package agenda;

public class Agenda {

	private Contacto[] agenda;

	public Agenda() {
		agenda = null;
	}

	public void aniadirContacto(Contacto C) {
		if (agenda == null) {
			agenda = new Contacto[10];
			agenda[0] = C;
			for (int i=1;i<agenda.length;i++){
	            agenda[i]=new Contacto();
	        }
			System.out.println("Contacto añadido");
			return;
		} else {

			for (int i = 0; i < agenda.length; i++) {
				if (agenda[i].getNombre() == "Vacio") {
					agenda[i] = C;
					System.out.println("Contacto añadido");
					return;
				} else if (C.getNombre().equalsIgnoreCase(agenda[i].getNombre())) {
					System.out.println("El contacto indicado ya existe");
					return;
				}
			}
		}
	}

	public void existeContacto(Contacto C) {
		for (int i = 0; i < agenda.length; i++) {
			if (!C.getNombre().equalsIgnoreCase(agenda[i].getNombre())) {
				System.out.println("El contacto indicado no existe");
				return;
			}
			System.out.println("El contacto indicado si existe");
			return;
		}
	}

	public void listarContactos() {
		for (int i = 0; i < agenda.length; i++) {
			System.out.println(agenda[i].toString());
		}
	}

	public void buscaContacto(String nombre) {
		for (int i = 0; i < agenda.length; i++) {
			if (nombre.equalsIgnoreCase(agenda[i].getNombre())) {
				System.out.println(agenda[i].getTelefono());
				return;
			}
			System.out.println("El nombre indicado no se ha encontrado");
		}
	}

	public void eliminarContacto(Contacto C) {
		for (int i = 0; i < agenda.length; i++) {
			if (C.getNombre().equalsIgnoreCase(agenda[i].getNombre())) {
				agenda[i]= new Contacto();
				System.out.println("El contacto ha sido eliminado");
				return;
			}else System.out.println("El contacto no ha sido eliminado o no existe");
		}
	}
	public int huecosLibres() {
		int contador = 0;
		for (int i = 0; i < agenda.length; i++) {
			if(agenda[i].getNombre()=="Vacio") {
				contador++;
			}
		}
		return contador;
	}
}
