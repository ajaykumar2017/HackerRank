package easy_MyHackerRankCodes;
import java.util.*;
public class The_Love_Letter_Mystery {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//Taking input from user
		int q = scanner.nextInt(); //The number of queries
		//The next q lines will each contain a string s.
		for(int i=0; i<q; i++) {
			String s = scanner.next();
			//Showing the output
			int result = theLoveLetterMystery(s);
			System.out.println(result);
		}
		scanner.close();
	}
	
    private static int theLoveLetterMystery(String s) {
    	int n = s.length();
    	int middleIndex = n/2;
    	int noOperations = 0;
    	for(int i=0; i<middleIndex; i++) {
    		noOperations = noOperations + Math.abs((int)(s.charAt(i) - s.charAt(n-1-i)));
    	}
    	return noOperations;
    }
}
