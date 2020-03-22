package easy_MyHackerRankCodes;
import java.util.*;
public class Funny_String {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//Taking input
		int q = scanner.nextInt();//the number of queries
		//Showing output
		for(int i=0; i<q; i++) {
			String s = scanner.next();
			String result = funnyString(s);
			System.out.println(result);
		}
	}
    private static String funnyString(String s) {
    	StringBuilder sb = new StringBuilder();
    	sb.append(s);
    	StringBuilder sb_reverse = new StringBuilder();
    	sb_reverse.append(s).reverse();
    	String result =null;
    	int[] diff_sb = new int[sb.length()-1];
    	int[] diff_sb_reverse = new int[sb_reverse.length()-1];
    	for(int i=0; i<sb.length()-1; i++) {
    		diff_sb[i] = Math.abs((int)(sb.charAt(i)-sb.charAt(i+1))); 
    	}
    	for(int i=0; i<sb_reverse.length()-1; i++) {
    		diff_sb_reverse[i] = Math.abs((int)(sb_reverse.charAt(i)-sb_reverse.charAt(i+1))); 
    	}
    	for(int i=0; i<diff_sb.length; i++) {
    		if(diff_sb[i] == diff_sb_reverse[i]) {
    			result = "Funny";
    		} else {
    			result = "Not Funny";
    			break;
    		}
    	}
    	return result;
    }
}
