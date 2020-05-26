package easy_MyHackerRankCodes;

import java.util.*;

public class Making_Anagrams {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking input from user
		String s1 = scanner.next();
		String s2 = scanner.next();
		
		//Showing the output
		int result = makingAnagrams(s1, s2);
		System.out.println(result);
	}

	private static int makingAnagrams(String s1, String s2) {
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		
		for(char c : s2.toCharArray()) {
			int index = sb1.indexOf(String.valueOf(c));
			if(index > -1)
				sb1 = sb1.deleteCharAt(index);
		}
		
		for(char c : s1.toCharArray()) {
			int index = sb2.indexOf(String.valueOf(c));
			if(index > -1)
				sb2 = sb2.deleteCharAt(index);
		}
		
		return sb1.length() + sb2.length();
	}

}
