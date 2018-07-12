package poo;

public class Pruebas {
	
	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados ("Paco");
		Empleados trabajador2 = new Empleados ("Ana");
		Empleados trabajador3 = new Empleados ("Juan");
		
		trabajador1.cambiaSeccion("RRHH");
		//trabajador1.cambiaNombre("Maria");
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(Empleados.dameIdSiguiente());
	}
}

class Empleados{
	
	public Empleados(String nom){
		nombre = nom;
		seccion = "Administracion";
		Id=Idsiguiente;
		Idsiguiente++;
	}
	
	public void cambiaSeccion(String seccion){
		this.seccion=seccion;
	}
	
	public String devuelveDatos(){
		return "El nombre es : " + nombre + " y la seccion es " + seccion + " y el Id es: " + Id;
	}
	
	//Metodo Estatico.
	public static String dameIdSiguiente(){
		return "El IdSiguiente es: " + Idsiguiente;
	}
	
	private final String nombre;
	private String seccion;
	private static int Idsiguiente = 1;
	public int Id;	
}
