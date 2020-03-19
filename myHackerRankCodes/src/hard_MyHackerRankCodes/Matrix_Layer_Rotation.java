package hard_MyHackerRankCodes;

import java.util.*;

public class Matrix_Layer_Rotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int r = sc.nextInt();
		sc.nextLine();
		List<List<Integer>> matrix = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				temp.add(sc.nextInt());
			}
			matrix.add(temp);
		}
		matrixRotation(matrix, r);
	}

	private static void matrixRotation(List<List<Integer>> tempMatrix, int r) {
		int[][] matrix = new int[tempMatrix.size()][tempMatrix.get(0).size()];
		int k = 0;
		for (List<Integer> temp : tempMatrix) {
			int j = 0;
			for (Integer temp1 : temp) {
				matrix[k][j++] = temp1;
			}
			k++;
		}
		int row = matrix.length;
		int column = matrix[0].length;
		// Finding the minimum number of rings
		int totalRings = Math.min(row, column) / 2;
		// Now take the loop of totalrings times
		for (int i = 0; i < totalRings; i++) {
			int numRotations = r % (2 * (row + column - 4 * i) - 4);
			for (int z = 0; z < numRotations; z++) {
				// Step 1: Rotating Top row
				for (int j = i; j < column - 1 - i; j++) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[i][j + 1];
					matrix[i][j + 1] = temp;
				}
				// Step 2: Rotating right Column
				for (int j = i; j < row - 1 - i; j++) {
					int temp = matrix[j][column - 1 - i];
					matrix[j][column - 1 - i] = matrix[j + 1][column - 1 - i];
					matrix[j + 1][column - 1 - i] = temp;
				}
				// Step 3: Rotating bottom row
				for (int j = column - 1 - i; j > i; j--) {
					int temp = matrix[row - 1 - i][j];
					matrix[row - 1 - i][j] = matrix[row - 1 - i][j - 1];
					matrix[row - 1 - i][j - 1] = temp;
				}
				// Step 4: Rotating Left Column
				for (int j = row - 1 - i; j > i + 1; j--) {
					int temp = matrix[j][i];
					matrix[j][i] = matrix[j - 1][i];
					matrix[j - 1][i] = temp;
				}
			}
		}
		// Printing the rotated matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
