package medium_MyHackerRankCodes;

import java.util.*;

public class The_Grid_Search {

	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// INPUT
		int t = scanner.nextInt(); // the number of test cases
		// Each of the t test cases is represented as follows:

		for (int i = 0; i < t; i++) {
			/*
			 * The first line contains two space-separated integers R and C, indicating the
			 * number of rows and columns in the gridG .
			 */
			int R = scanner.nextInt();
			int C = scanner.nextInt();
			scanner.nextLine();
			// This is followed by R lines, each with a string of C digits representing the
			// gridG.
			int[][] gridG = new int[R][C];
			for (int j = 0; j < R; j++) {
				String row = scanner.nextLine();
				for (int k = 0; k < C; k++) {
					gridG[j][k] = Character.getNumericValue(row.charAt(k));
				}
			}
			/*
			 * The second line contains two space-separated integers r and c, indicating the
			 * number of rows and columns in the gridP .
			 */
			int r = scanner.nextInt();
			int c = scanner.nextInt();
			scanner.nextLine();
			// This is followed by R lines, each with a string of C digits representing the
			// gridG.
			int[][] gridP = new int[r][c];
			for (int j = 0; j < r; j++) {
				String row = scanner.nextLine();
				for (int k = 0; k < c; k++) {
					gridP[j][k] = Character.getNumericValue(row.charAt(k));
				}
			}

			// OUTPUT
			String result = gridSearch(gridG, gridP);
			System.out.println(result);
		}
	}

	private static String gridSearch(int[][] G, int[][] P) {
		for (int i = 0; i < G.length; i++) {
			for (int j = 0; j < G[0].length; j++) {
				if(G[i][j] == P[0][0] && j <= G[0].length - P[0].length) {
					if(isMatch(i, j, G, P))
						return "YES";
				}
			}
		}
		return "NO";
	}

	private static boolean isMatch(int i, int j, int[][] G, int[][] P) {
		int colG = j;

		for (int r = 0; r < P.length; r++, i++) {
			for (int c = 0; c < P[0].length; c++, j++) {
				if (G[i][j] != P[r][c]) {
					return false;
				}
			}
			j = colG;
		}
		return true;
	}

}
