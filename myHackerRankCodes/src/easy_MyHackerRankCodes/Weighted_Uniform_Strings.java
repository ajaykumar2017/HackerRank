package easy_MyHackerRankCodes;

import java.util.*;

public class Weighted_Uniform_Strings {
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// input from the user
		String s = sc.next();
		int n = sc.nextInt();
		int[] queries = new int[n];
		for (int i = 0; i < n; i++) {
			queries[i] = sc.nextInt();
		}

		// output
		String[] result = weightedUniformStrings(s, queries);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	private static String[] weightedUniformStrings(String s, int[] queries) {
		Set<Integer> wt = new HashSet<Integer>();
		String[] result = new String[queries.length];
		int l = s.length();
		int previousAsciiValue = 0;
		int charCount = 0;

		for (int i = 0; i < l; i++) {
			int currentAsciiValue = s.charAt(i) - 'a' + 1;
			if (previousAsciiValue == currentAsciiValue)
				charCount++;
			else {
				charCount = 1;
				previousAsciiValue = currentAsciiValue;
			}

			wt.add(currentAsciiValue * charCount);
		}

		for (int i = 0; i < queries.length; i++) {
			if (wt.contains(queries[i]))
				result[i] = "Yes";
			else
				result[i] = "No";
		}
		return result;
	}

}
