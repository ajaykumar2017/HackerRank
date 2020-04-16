package easy_MyHackerRankCodes;

import java.util.*;

public class Separate_the_Numbers {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// input
		int q = scanner.nextInt(); // Integer q the number of strings to evaluate
		for (int i = 0; i < q; i++) {
			separateNumbers(scanner.next());
		}
		scanner.close();
	}
	

	/**
	 * Approach:
	 * Step 1: We take the iteration up to half of the string as a/c to problem a[i]-a[i-1]==1
	 * Step 2: Now take the each possible starting number.
	 * Step 3: Increment it one by one and match this with the real String.
	 * Step 3: If -> it matches with the String then print (valid ? "YES " + firstx : "NO");
	 * 		   Else -> Start with the different possible starting number and repeat from step 3.
	 */
	private static void separateNumbers(String s) {
		boolean valid = false;
		long firstx = -1;
		// Try each possible starting number
		for (int i=1; i<=s.length()/2; ++i) {
			long x = Long.parseLong(s.substring(0,i));
			firstx = x;
		   // Build up sequence starting with this number
			String test = Long.toString(x);
			while (test.length() < s.length()) {
				test += Long.toString(++x);
			}
			// Compare to original
			if (test.equals(s)) {
				valid = true;
				break;
			}
		}
		System.out.println(valid ? "YES " + firstx : "NO");
    }
}
