package medium_MyHackerRankCodes;

import java.util.*;

public class Sherlock_And_The_Valid_String {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking input from user
		String s = scanner.next(); // input String

		// Showing the output
		String result = isValid(s);
		System.out.println(result);
	}

	private static String isValid(String s) {
		String unq = uniqueString(s);
		int[] freq = frequency(unq, s);
		int count2 = 0;
		int count = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 2)
				count2++;
			if (freq[i] > 1)
				count++;
		}
		return (count == 1 && count2 == 1) || (count == 0 && count2 == 0) ? "YES" : "NO";
	}

	private static String uniqueString(String s) {
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		StringBuilder sb = new StringBuilder(String.valueOf(ch));
		for (int i = 0; i < sb.length() - 1;) {
			if (sb.charAt(i) == sb.charAt(i + 1)) {
				sb = sb.deleteCharAt(i + 1);
			} else {
				i++;
			}
		}
		return sb.toString();
	}

	private static int[] frequency(String unq, String s) {
		int[] freq = new int[unq.length()];
		for (int i = 0; i < unq.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (unq.charAt(i) == s.charAt(j))
					freq[i]++;
			}
		}
		return freq;
	}
}
