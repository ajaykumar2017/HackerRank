package myHackerRankCodes;

import java.util.*;

public class CamelCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		String str = sc.next();
		//output
		int result = camelcase(str);
		System.out.println(result);

	}

	private static int camelcase(String str) {
		int count = 0;
		for (int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) count++;
		}
		return count+1;
	}
}
