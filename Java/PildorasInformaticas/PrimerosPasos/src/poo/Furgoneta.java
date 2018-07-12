package poo;

public class Furgoneta extends Coche {
	
	private int capacidad_carga;
	private int plazas_extra;
	
	//Constructor de la clase 
	public Furgoneta(int plazas_extra, int capacidad_carga){
		super(); // Llamar al constructor de la clase padre
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}
	
	// funcion propia de la clase furgoneta
	public String dimeDatosFurgoneta(){
		return "La capacidad de carga es " + capacidad_carga + " Y las plasas son: " + plazas_extra;
	}
}
