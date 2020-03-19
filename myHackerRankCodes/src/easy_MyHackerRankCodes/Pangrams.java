package easy_MyHackerRankCodes;

import java.util.*;

public class Pangrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); // a string s
		String result = pangrams(s);
		System.out.println(result);
	}

	private static String pangrams(String s) {
		int MAX_CHARS = 256, count = 0;
		boolean[] status = new boolean[MAX_CHARS];
		for (int i = 0; i < s.length(); i++) {
			status[s.toLowerCase().charAt(i)] = true;
		}
		for (char i = 'a'; i <= 'z'; i++) {
			if (status[i])
				count++;
		}
		if(count==26)
			return "pangram";
		else
			return "not pangram";
	}
}
