import java.util.*;

public class TCS_Wings1_Q2 {

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
		int totalProfit = 0;
		// Initialize lower as first element and higher as zero
		int lower = arr[0];
		int higher = 0;

		// Iterate from 1 to n-1 to compare the first element to next one
		for (int i = 1; i < n; i++) {
			/**
			 * Checking if current element is bigger than previous one then assign current
			 * one to higher
			 */
			if (arr[i] > arr[i - 1]) {
				higher = arr[i];
			} else {
				/*
				 * if current element is lower than previous one then add value of (higher -
				 * lower) to totalProfit
				 */
				totalProfit = higher > lower ? totalProfit + (higher - lower) : totalProfit;
				/*
				 * now assign lower as current element as it will be a part of next subarray and
				 * higher as zero as we are unknown of the higher value for the subarray
				 */
				lower = arr[i];
				higher = 0;
			}
			/**
			 * Check if it is the last element then add (higher-lower) value to totalProfit
			 * as there is no more elements to check. Also last element of the subarray
			 */
			if (i == n - 1 && lower < higher)
				totalProfit = totalProfit + (higher - lower);
		}

		// Return the first element as it is the greatest element of the list
		return totalProfit;
	}
}