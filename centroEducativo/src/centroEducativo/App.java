package centroEducativo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentroEducativo ce = new CentroEducativo("GSD");
		ce.addPersona(new Profesor ("pedro",34,"1234","Matematicas"));
		ce.addPersona(new Estudiante ("Paco",18,"2222","4B"));
		ce.addPersona(new Mantenimiento ("Jose",40,"111","Electricidad"));
		
		ce.mostrar();
		ce.editPersona("2222");
		ce.mostrar();
		ce.eliminarPersona("2222");
		ce.mostrar();
	}

}
