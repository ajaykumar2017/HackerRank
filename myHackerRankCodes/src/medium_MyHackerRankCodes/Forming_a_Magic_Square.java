package medium_MyHackerRankCodes;

import java.util.Scanner;

public class Forming_a_Magic_Square {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//Taking input
		int[][] matrix = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		int result = formingMagicSquare(matrix);
		//Showing output
		System.out.println(result);
	}
    private static int formingMagicSquare(int[][] matrix) {
    	return 0;
    }
}
