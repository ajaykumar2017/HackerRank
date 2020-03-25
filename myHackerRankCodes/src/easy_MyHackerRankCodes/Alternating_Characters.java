package easy_MyHackerRankCodes;
import java.util.*;
public class Alternating_Characters {
	private static final Scanner scanner =  new Scanner(System.in);
	public static void main(String[] args) {
		//Taking input
		int q = scanner.nextInt(); //The number of queries
		//The next q lines each contain a string .
		for(int i=0; i<q; i++) {
			String s = scanner.next();
			int result = alternatingCharacters(s);
			System.out.println(result);
		}
	}
	
    private static int alternatingCharacters(String s) {
    	StringBuilder sb = new StringBuilder();
    	sb.append(s);
    	int numDeletions = 0;
    	for(int i=0; i<sb.length(); i++) {
    		for(int j = i+1; j<sb.length(); ) {
    			if(sb.charAt(i) == sb.charAt(j)) {
    				// If two consecutive characters are the same, delete one of them.
    				sb.deleteCharAt(j);
    				numDeletions++;
    			}
    				
    			else
    				break;
    		}
    	}
    	return numDeletions;
    }
}
