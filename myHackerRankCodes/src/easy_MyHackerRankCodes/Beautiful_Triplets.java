package easy_MyHackerRankCodes;

import java.util.*;

public class Beautiful_Triplets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		int n = sc.nextInt(); // length of the sequence
		int d = sc.nextInt(); // beautiful difference
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int result = beautifulTriplets(d, arr);
		System.out.println(result);
	}

	private static int beautifulTriplets(int d, int[] arr) {
		int count = 0, n = arr.length;
		for (int i = 0; i < n - 2; i++) {
			int j;
			for (j = i + 1; j < n - 1; j++) {
				if ((arr[j] - arr[i]) == d)
					break;
			}
			for (int k = j + 1; k < n; k++) {
				if ((arr[k] - arr[j]) == d) {
					count++;
					break;
				}
			}
		}
		return count;
	}
}
