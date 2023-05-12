package roundRobin;

import java.util.ArrayList;

public class CPU {

	private int quantum;
	ArrayList<Proceso> array;

	public CPU(int quantum) {
		super();
		this.quantum = quantum;
		array = new ArrayList<Proceso>();
	}

	public void encolar(Proceso p) {
		array.add(p);
	}

	public void run() {
		if (array.size() > 0) {
			while (array.size() > 0) {
				Proceso aux = desencolar();
				if (aux == null) {
					System.out.println("No hay procesos en la cola");
					return;
				}
				aux.setQuantum(aux.getQuantum() - quantum);
				if (aux.getQuantum() > 0) {
					array.add(aux);

				} else
					System.out.println("El proceso con PID " + aux.getPID() + " se ha quedado sin quantum");
				if (array.size() > 0) {
					System.out.println("La cola esta asi");
					imprimirCola();
				} else
					System.out.println("No quedan procesos en la cola");
			}

		}

	}

	public void imprimirCola() {
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).toString());
		}
	}

	public Proceso desencolar() {
		Proceso aux = array.get(0);
		array.remove(0);
		return aux;
	}

}
