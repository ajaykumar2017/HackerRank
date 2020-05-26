package easy_MyHackerRankCodes;

import java.util.*;

public class Anagram {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking the input from user
		int q = scanner.nextInt(); // The number of test cases
		for (int i = 0; i < q; i++) {
			String s = scanner.next();
			int result = anagram(s);
			System.out.println(result);
		}
	}

	private static int anagram(String s) {
		if (s.length() % 2 != 0)
			return -1;

		StringBuilder sb1 = new StringBuilder(s.substring(0, s.length() / 2));
		StringBuilder sb2 = new StringBuilder(s.substring(s.length() / 2));

		for (char c : sb2.toString().toCharArray()) {
			int index = sb1.indexOf(String.valueOf(c));
			if (index > -1)
				sb1 = sb1.delete(index, index + 1);
		}

		return sb1.length();
	}

}
