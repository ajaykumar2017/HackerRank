package easy_MyHackerRankCodes;

import java.util.*;

public class String_Construction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		int n = sc.nextInt(); // number of strings
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			int result = stringConstruction(str);
			System.out.println(result);
		}
	}

	private static int stringConstruction(String str) {
		int cost = 0;
		boolean[] status = new boolean[256];
		for (int i=0; i<str.length(); i++) {
			status[str.charAt(i)] = true;
		}
		for (int i=0; i<256; i++) {
			if(status[i]) cost++;
		}
		return cost;
	}
}
