import java.util.*;

public class TCS_Wings1_Q1 {

	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking the input from user
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Printing Output
		System.out.println(maxProfit(arr, n));

	}

	private static int maxProfit(int[] arr, int n) {
		List<Integer> profitList = new ArrayList<Integer>();
		// Initialize first element of array to profit
		int profit = arr[0];

		// Iterate from 1 to n-1 to compare the first element to next one
		for (int i = 1; i < n; i++) {
			/**
			 * Checking if current element is bigger than previous one then add to profit as
			 * we have to find the sorted subarray with highest sum of elements
			 */
			if (arr[i] > arr[i - 1]) {
				profit = profit + arr[i];
			} else {
				/*
				 * add to profitList if current element is smaller than previous current element
				 * will be part of next subarray
				 */
				profitList.add(profit);
				// Assign current element to profit as this is the part of next subarray
				profit = arr[i];
			}
			/**
			 * Check if it is the last element of the array so we have to add to profitList
			 * as no more comparison
			 */
			if (i == n - 1)
				profitList.add(profit);

		}

		// Sort the profitList as we need to get the greatest element
		Collections.sort(profitList, Collections.reverseOrder());

		// Return the first element as it is the greatest element of the list
		return profitList.get(0);
	}

}
