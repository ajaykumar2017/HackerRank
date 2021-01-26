package medium_MyHackerRankCodes;

import java.util.*;

public class Pairs {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking the input from the user
		int n = scanner.nextInt(); // the size of arr
		int k = scanner.nextInt(); // the target value
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		// Showing the output
		int result = pairs(k, arr);
		System.out.println(result);
	}

	/**
	 * Credits: https://www.geeksforgeeks.org/count-pairs-difference-equal-k/
	 * Algorithm:
	 * ==========
	 * We can find the count in O(nLogn) time using a O(nLogn) sorting algorithm
	 * like Merge Sort, Heap Sort, etc. Following are the detailed steps.
	 * 
	 * 1) Initialize count as 0 
	 * 2) Sort all numbers in increasing order.
	 * 3) Remove duplicates from array. 
	 * 4) Do following for each element arr[i] a) Binary
	 * Search for arr[i] + k in subarray from i+1 to n-1. b) If arr[i] + k found,
	 * increment count. 
	 * 5) Return count.
	 * 
	 * @param k
	 * @param arr
	 * @return
	 */
	private static int pairs(int k, int[] arr) {
		int n = arr.length;
		int count = 0, i;

		// Sort array elements
		Arrays.sort(arr);

		// code to remove duplicates from arr[]

		// Pick a first element point
		for (i = 0; i < n - 1; i++)
			if (binarySearch(arr, i + 1, n - 1, arr[i] + k) != -1)
				count++;

		return count;
	}

	private static int binarySearch(int arr[], int low, int high, int x) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if (x == arr[mid])
				return mid;
			if (x > arr[mid])
				return binarySearch(arr, (mid + 1), high, x);
			else
				return binarySearch(arr, low, (mid - 1), x);
		}
		return -1;
	}

}
