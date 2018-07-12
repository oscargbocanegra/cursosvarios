
public class v_26_Arrays_Bidimencionales_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = 	{{15, 16, 17, 18, 19},
							{25, 35, 45, 55, 65}, 
							{156, 157, 151, 152, 153}, 
							{154, 155, 156, 157, 15}};
		
		
		/*// Bucle for tradicional
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		*/
		
		//Bucle Foreach
		for (int[] fila : matrix) {
			System.out.println();
			for (int z : fila) {
				System.out.print(z + " ");
			}
		}
	}
}
