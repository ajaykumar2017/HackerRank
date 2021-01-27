package easy_MyHackerRankCodes;

import java.util.*;

public class Sherlock_And_Array {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking the input from the user
		int t = scanner.nextInt(); // the number of test cases
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt(); // the number of elements in the array
			List<Integer> arr = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				arr.add(scanner.nextInt());
			}
			// Showing the output
			String result = balancedSums(arr);
			System.out.println(result);
		}
	}

	private static String balancedSums(List<Integer> arr) {
		int sum = 0;
		int left = 0;
		for (int su : arr) {
			sum += su;
		}
		for (int fu : arr) {
			if (2 * left == sum - fu) {
				return "YES";
			} else {
				left += fu;
			}
		}
		return "NO";
	}

}
