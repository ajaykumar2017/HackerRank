package medium_MyHackerRankCodes;

import java.util.Scanner;

public class Highest_Value_Palindrome {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking input from user
		int n = scanner.nextInt(); // The number of digits in the number
		int k = scanner.nextInt(); //maximum number of changes allowed
		String s = scanner.next(); // n digit string of numbers

		// Showing the output
		String result = highestValuePalindrome(s);
		System.out.println(result);
	}
	
	private static String highestValuePalindrome(String s, int n, int k) {
		
    }
}
