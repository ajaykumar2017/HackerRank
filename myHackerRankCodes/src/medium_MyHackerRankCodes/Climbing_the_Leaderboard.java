package medium_MyHackerRankCodes;

import java.util.Scanner;

public class Climbing_the_Leaderboard {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// input
		int n = scanner.nextInt(); // Integer n the number of players on the leaderboard.
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) { // n space Integers the leaderboard scores in decreasing order.
			scores[i] = scanner.nextInt();
		}
		int m = scanner.nextInt(); // Integer m denoting the number games Alice plays
		int[] alice = new int[m];
		for (int j = 0; j < m; j++) { // m space-separated integers alice[j] the game scores.
			alice[j] = scanner.nextInt();
		}

		// output
		// Print m integers. The j'th integer should indicate Alice's rank after playing
		// the j'th game.
		int[] result = climbingLeaderboard(scores, alice);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		scanner.close();
	}

	private static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int n = scores.length;
		int m = alice.length;
		
		int res[] =new int[m];
		int rank[] = new int[n];
		
		rank[0]= 1;
		
		for(int i=1; i<n; i++) {
			if(scores[i] == scores[i-1]) {
				rank[i] = rank[i-1];
			} else {
				rank[i] = rank[i-1]+1;
			}
		}
		
		for(int i=0; i<m; i++) {
			int aliceScore = alice[i];
			if(aliceScore > scores[0]) {
				res[i] = 1;
			} else if(aliceScore < scores[n-1]) {
				res[i] = rank[n-1]+1;
			} else {
				int index = binarySearch(scores, aliceScore);
				res[i] = rank[index];
			}
		}
		return res;
	}

	private static int binarySearch(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;
		
		while(low<=high) {
			int mid = low + (high - low) / 2;
			if(a[mid] == key) {
				return mid;
			} else if(a[mid] < key && key < a[mid - 1]) {
				return mid;
			} else if(a[mid] > key && key >= a[mid + 1]) {
				return mid+1;
			} else if(a[mid] < key) {
				high = mid - 1;
			} else if(a[mid] > key) {
				low = mid + 1;
			}
		}
		return -1;
	}

}
