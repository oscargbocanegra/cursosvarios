package poo;

public class Uso_Vehiculo {
	public static void main(String[] args) {
		
		Coche micoche1 = new Coche();
		Furgoneta mifurgoneta = new Furgoneta (7,580);
		
		micoche1.establece_color("Rojo");
		mifurgoneta.establece_color("Azul");
		mifurgoneta.configuraAsientos("si");
		mifurgoneta.configura_climatizador("si");
		
		System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
		System.out.println(mifurgoneta.dime_datos_generales());
		
		
	}
}
