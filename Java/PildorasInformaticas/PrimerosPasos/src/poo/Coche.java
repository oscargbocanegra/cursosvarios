package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private int peso_plataforma;
	
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	
	public Coche(){
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
		color="azul";
		peso_plataforma = 500;
	}
	
	public void configuraAsientos(String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")){
			this.asientos_cuero=true;
		}else{
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos(){
		if (asientos_cuero){
			return "El coche tiene asientos de cuero";
		}else{
			return "El coche tiene asientos de serie";
		}
	}

	public String dime_datos_generales(){
		
		return "La plataforma de  vehiculo tiene " + ruedas + "ruedas, mide " + largo/1000 + "metros de ancho de " +ancho+ "cm y un peso de plataforma de " +peso_plataforma+ "kg";
		
	};

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	// metodo setter del atributo color
	public void establece_color(String color_coche){
		color = color_coche;
	}
	
	public String dime_color(){
		return "El color del coche es " + color;
	}
	
	public void configura_climatizador (String climatizador){
		if(climatizador.equalsIgnoreCase("si")){
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador(){
		if (climatizador == true){
			return "El coche incorpora climatizador";
		}else{
			return "El coche NO incorpora climatizador";
		}
	}
	
	public int precio_coche(){
		int precio_final = 10000;
		
		if(asientos_cuero==true){
			precio_final += 2000;
		}if (climatizador==true){
			precio_final +=1500;
		}
		return precio_final;
	}
}
