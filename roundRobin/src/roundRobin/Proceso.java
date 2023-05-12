package roundRobin;

import java.util.ArrayList;
import java.util.Scanner;

public class Proceso {
	private int PID;
	private int quantum;
	
	public Proceso(int pID, int quantum) { 
		PID = pID;
		this.quantum = quantum;
	}
	
	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public int getQuantum() {
		return quantum;
	}
	public void setQuantum(int quantum) {
		this.quantum = quantum;
	}
	
	@Override
	public String toString() {
		return "[PID=" + PID + ", quantum=" + quantum + "]";
	}
}
