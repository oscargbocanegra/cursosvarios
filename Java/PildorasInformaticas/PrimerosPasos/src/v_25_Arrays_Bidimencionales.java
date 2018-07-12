
public class v_25_Arrays_Bidimencionales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = new int [4][5];
		
		matrix[0][0] = 15;
		matrix[0][1] = 16;
		matrix[0][2] = 17;
		matrix[0][3] = 18;
		matrix[0][4] = 19;
		
		matrix[1][0] = 25;
		matrix[1][1] = 35;
		matrix[1][2] = 45;
		matrix[1][3] = 55;
		matrix[1][4] = 65;
		
		matrix[2][0] = 156;
		matrix[2][1] = 157;
		matrix[2][2] = 151;
		matrix[2][3] = 152;
		matrix[2][4] = 153;
		
		matrix[3][0] = 154;
		matrix[3][1] = 155;
		matrix[3][2] = 156;
		matrix[3][3] = 157;
		matrix[3][4] = 15;
		
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
	}
}
