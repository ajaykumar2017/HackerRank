package easy_MyHackerRankCodes;

import java.util.*;

public class Super_Reduced_String {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking input
		String s = scanner.next();
		// Showing output
		String result = superReducedString(s);
		System.out.println(result);
	}

	private static String superReducedString(String s) {
		//We are using StringBuilder as they are 'A mutable sequence of characters'
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		int i = 0;
		while (i < sb.length() - 1) {
			if (sb.charAt(i) == sb.charAt(i + 1)) {
				sb.deleteCharAt(i);
				sb.deleteCharAt(i); // we should not use (i+1) as one letter has been deleted.
				/**
				 * we have top check again if there is same adjacent string after deletion so we
				 * make it to ZERO.
				 */
				i = 0;
				/**
				 * we continue as two letters has been already deleted and we should not
				 * increase the value of i
				 */
				continue;
			}
			i++;
		}
		/**
		 * We will return "Empty String" if String is empty
		 */
		if (sb.length() == 0) {
			return "Empty String";
		} else {
			return sb.toString();
		}
	}
}
