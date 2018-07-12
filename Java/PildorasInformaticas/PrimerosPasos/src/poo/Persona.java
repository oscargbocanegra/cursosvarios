package poo;

public abstract class Persona {

	private String nombre;

	/*** Constructor de la clase */
	public Persona(String nom) {
		nombre = nom;
	}

	/*** Metodo que retorna el nombre */
	public String dameNombre() {

		return nombre;
	}

	/**
	 * Metodo abstracto que sera sobreescrito en las clases con diferente
	 * funcionalidad
	 */
	public abstract String dameDescripcion();

}
