package easy_MyHackerRankCodes;

import java.util.*;

public class Luck_Balance {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking input from user
		/**
		 * The first line contains two space-separated integers and , the number of
		 * preliminary contests and the maximum number of important contests Lena can
		 * lose.
		 */
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		/**
		 * Each of the next lines contains two space-separated integers, and , the
		 * contest's luck balance and its importance rating.
		 */
		int[][] contests = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				contests[i][j] = scanner.nextInt();
			}
		}

		// Showing output
		int result = luckBalance(k, contests);
		System.out.println(result);
	}

	private static int luckBalance(int k, int[][] contests) {
		List<Integer> important = new ArrayList<Integer>();
		int totalLuck = 0;
		for (int i = 0; i < contests.length; i++) {
			if (contests[i][1] == 1) {
				important.add(contests[i][0]);
			}
			totalLuck += contests[i][0];
		}
		/**
		 * Lena can lose maximum of k of important contests.
		 * So we find no. of contests Lena can win
		 * canWin = importantContests - k
		 */
		int canWin = important.size() - k, score = 0;
		//As we have to maximize luck so we are sorting the list in ascending order
		Collections.sort(important);
		for (int i = 0; i < canWin; i++) {
			//Multiply by 2 as we have already added in totalLuck
			score += 2 * important.get(i);
		}
		//We will subtract the score as Lena has won this.
		return totalLuck - score;
	}
}
