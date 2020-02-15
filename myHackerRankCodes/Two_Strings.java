package myHackerRankCodes;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		int p = sc.nextInt(); //number of test cases
		for(int i=0; i<p; i++) {
			String s1 =sc.next();
			String s2 = sc.next();
			//showing output for each test cases
			String result = twoStrings(s1, s2);
			System.out.println(result);
		}
	}
	private static int MAX_CHAR =26;
    private static String twoStrings(String s1, String s2) {
    	String result = "NO";
    	// vector for storing character occurrences
    	boolean v[] = new boolean[MAX_CHAR];
    	Arrays.fill(v, false);
        // increment vector index for every 
        // character of str1
    	for(int i=0; i<s1.length(); i++)
    		v[s1.charAt(i)-'a']=true;
        // checking common substring of str2 in str1 
    	for(int i=0; i<s2.length(); i++) {
    		if(v[s2.charAt(i)-'a'])
    			result = "YES";
    	}
    	return result;
    }
}
