package easy_MyHackerRankCodes;

import java.util.*;

public class Happy_Ladybugs {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// input
		int g = scanner.nextInt(); // Integer g the number of games
		for (int i = 0; i < g; i++) {
			int n = scanner.nextInt(); //the number of cells on the board.
			String b = scanner.next(); // describing the n cells on the board
			String result = happyLadybugs(b);
			System.out.println(result);
		}
		scanner.close();
	}
	
    private static String happyLadybugs(String s) {
        if (hasUnique(s)) {
            return "NO";
        }
        
        if (alreadyHappy(s)) {
            return "YES";
        }
        
        if (hasSpace(s)) {
            return "YES";
        }
        
        return "NO";
    }
    
    private static boolean hasUnique(String s) {
        int[] ascii = new int[26];
        
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) != '_') {
                ascii[(int)s.charAt(i)-65]++;
            }
        }
        
        for (int i=0;i<26;i++) {
            if (ascii[i] == 1) {
                return true;
            }
        }
        
        return false;
    }
    
    private static boolean alreadyHappy(String s) {
        for (int i=0;i<s.length()-1;i++) {
            if (i == 0 && s.charAt(i) != s.charAt(i+1)) {
                return false;
            }
            else if (s.charAt(i) != s.charAt(i+1) && s.charAt(i) != s.charAt(i-1)){
                return false;
            }
        }
        
        return true;
    }
    
    private static boolean hasSpace(String s) {
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '_') {
                return true;
            }
        }
        
        return false;
    }
}
