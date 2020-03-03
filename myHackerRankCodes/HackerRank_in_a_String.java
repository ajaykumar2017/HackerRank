package myHackerRankCodes;
import java.util.*;

public class HackerRank_in_a_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int i=0; i<q; i++) {
			String s = sc.next();
			String result = hackerrankInString(s);
			System.out.println(result);
		}
	}
	private static String hackerrankInString(String s) {
		String hackerrank = "hackerrank" ;
		int j = 0,count = 0;
		for(int i=0; i<hackerrank.length(); i++) {
			while (j<s.length()) {
				if(hackerrank.charAt(i) == s.charAt(j)) {
					count++;
					j++;
					break;
				}
				j++;
			}
		}
		if(count==10)
			return "YES";
		else
			return "NO";
	}
}
