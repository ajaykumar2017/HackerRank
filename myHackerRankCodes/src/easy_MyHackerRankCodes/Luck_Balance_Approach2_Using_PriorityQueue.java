package easy_MyHackerRankCodes;

import java.util.*;

public class Luck_Balance_Approach2_Using_PriorityQueue {
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
		PriorityQueue<Integer> imp = new PriorityQueue<>(Collections.reverseOrder());
		int luck = 0;
		for (int row = 0; row < contests.length; row++) {
			if (contests[row][1] == 0) {
				luck += contests[row][0];
			} else {
				/**
				 * The java.util.PriorityQueue.offer() method is used to insert a particular
				 * element into the Priority Queue. It acts similar to the add() method of
				 * Priority Queue.
				 * Syntax:
				 * Priority_Queue.offer(Object element)
				 */
				imp.offer(contests[row][0]); // offer
			}
		}
		boolean decreaseLuck = false;
		while (!imp.isEmpty()) {
			if (k == 0)
				decreaseLuck = true;
			if (decreaseLuck == true)
				luck -= imp.poll();
			else
				luck += imp.poll();
			k--;
		}
		return luck;
	}
}
