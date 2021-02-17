package easy_MyHackerRankCodes;

import java.util.*;

public class Palindrome_Index {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// Taking input from the user
		int q = scanner.nextInt();
		for(int i = 0; i < q; i++) {
			String str = scanner.next();
			int result = palindromeIndex(str);
			System.out.println(result);
		}

	}
	
    private static int palindromeIndex(String s) {
    	int l = s.length();
        int i,j,a,b;
        for (i=0, j=l-1; i<l; i++,j--){
            if (s.charAt(i)!=s.charAt(j))
                break;
        }
        if (i>j) return -1;

        for (a = i+1, b = j;a<j && b>i+1; a++,b--){
            if (s.charAt(a)!=s.charAt(b))
                return j;
        }
        return i;
    }

}
