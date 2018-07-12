import java.util.Iterator;


public class v_24_Uso_Arrays_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] paises = new String [8];
		int [] matriz_aleatorios = new int[150];
		
		paises[0] = "España";
		paises[1] = "Colombia";
		paises[2] = "Chile";
		paises[3] = "Ecuador";
		paises[4] = "Argentina";
		paises[5] = "Venezuela";
		paises[6] = "Mexico";
		paises[7] = "Peru";
		
		/*
		for (int i = 0; i < paises.length; i++) {
			System.out.println("Pais " + (i+1) + paises[i]);
		*/
		
		for (String elementos : paises) {
			System.out.println("Paises " + elementos);
		}
		// For llena los numeros 
		for (int i = 0; i < matriz_aleatorios.length; i++) {
			matriz_aleatorios[i] = (int) (Math.random()*100);
		}
		
		// For Imprime los numeros
		for (int numeros : matriz_aleatorios) {
			System.out.print( numeros + " ");
			
		}
		
		
	}
}
