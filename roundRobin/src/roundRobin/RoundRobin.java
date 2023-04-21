package roundRobin;

import java.util.ArrayList;
import java.util.Scanner;

public class RoundRobin {
	private int PID;
	private int quantum;
	
	public RoundRobin(int pID, int quantum) { 
		PID = pID;
		this.quantum = quantum;
	}
	ArrayList<Objets> array = new ArrayList<Objets>();
	Scanner t = new Scanner(System.in);
}
