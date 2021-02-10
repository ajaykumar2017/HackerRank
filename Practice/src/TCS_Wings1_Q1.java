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
		System.out.println(maxBenefit(arr, n));

	}

	private static int maxBenefit(int[] arr, int n) {
		List<Integer> benefitList = new ArrayList<Integer>();
		// Initialize first element of array to benefit
		int benefit = arr[0];

		// Iterate from 1 to n-1 to compare the first element to next one
		for (int i = 1; i < n; i++) {
			/**
			 * Checking if current element is bigger than previous one then add to benefit as
			 * we have to find the sorted subarray with highest sum of elements
			 */
			if (arr[i] > arr[i - 1]) {
				benefit = benefit + arr[i];
			} else {
				/*
				 * add to benefitList if current element is smaller than previous current element
				 * will be part of next subarray
				 */
				benefitList.add(benefit);
				// Assign current element to benefit as this is the part of next subarray
				benefit = arr[i];
			}
			/**
			 * Check if it is the last element of the array so we have to add to benefitList
			 * as no more comparison
			 */
			if (i == n - 1)
				benefitList.add(benefit);

		}

		// Sort the benefitList as we need to get the greatest element
		Collections.sort(benefitList, Collections.reverseOrder());

		// Return the first element as it is the greatest element of the list
		return benefitList.get(0);
	}

}
