package poo;

import poo.Persona;

public class Uso_Persona {

	public static void main(String[] args) {

		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2017, 03, 07);
		lasPersonas[1] = new Alumno("Ana Lopez", "Biologicas");

		for (Persona persona : lasPersonas) {

			System.out.println(persona.dameNombre() + ", " + persona.dameDescripcion());
		}
	}
}
