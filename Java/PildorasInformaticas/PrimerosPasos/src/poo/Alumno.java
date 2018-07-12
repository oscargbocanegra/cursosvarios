package poo;

public class Alumno extends Persona {

	private String carrera;

	/** Constructor de la clase */
	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}

	@Override
	public String dameDescripcion() {
		return "Este Alumno esta estudiando la carrera de " + carrera;
	}
}
