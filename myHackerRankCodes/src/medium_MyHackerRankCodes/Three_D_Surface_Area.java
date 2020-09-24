package medium_MyHackerRankCodes;

import java.util.*;

public final class Three_D_Surface_Area {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Taking the input from the user
		String[] HW = scanner.nextLine().split(" ");

		int H = Integer.parseInt(HW[0]);

		int W = Integer.parseInt(HW[1]);

		int[][] A = new int[H][W];

		for (int i = 0; i < H; i++) {
			String[] ARowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < W; j++) {
				int AItem = Integer.parseInt(ARowItems[j]);
				A[i][j] = AItem;
			}
		}

		// Output
		int result = surfaceArea(A);
		System.out.println(result);
	}

	/*
	 * Approach:
	 * Step 1: A(i, j) represents the cube size of jth integer in ith line.
	 * Step 2: For individual A(i, j) the surface Area will be [ result = 4*A[i][j]+2 ].
	 * Step 3: Now we have to subtract the area for the corresponding column and row which will be hiddn after
	 * 		   placing the nearest cubes.
	 * Step 4: So we subtract the hidden area of next column by subtracting the minimum common area.
	 * 		   [ result = result - min_of(A[i][j], next column element) ]
	 * Step 5: We will do the same for the next row.
	 * 		   [ result = result - min_of(A[i][j], next row element) ]
	*/
	private static int surfaceArea(int[][] A) {
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				result += 4 * A[i][j] + 2;
				// Check whether it is last row
				if(i != A.length - 1) {
					result -= 2 * Math.min(A[i][j], A[i + 1][j]);
				}
				// Check whether it is last column
				if(j != A[0].length - 1) {
					result -= 2 * Math.min(A[i][j], A[i][j + 1]);
				}
			}
		}
		return result;
	}

}
