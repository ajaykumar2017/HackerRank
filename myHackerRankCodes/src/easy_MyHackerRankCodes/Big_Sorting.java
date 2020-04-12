package easy_MyHackerRankCodes;

import java.util.*;

public class Big_Sorting {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//input
		int n = scanner.nextInt(); //Integer n the number of strings unsorted
		String[] unsorted = new String[n];
		for(int i=0; i<n; i++) {
			unsorted[i] = scanner.next();
		}
		String[] result = bigSorting(unsorted);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		scanner.close();
	}
	
    private static String[] bigSorting(String[] unsorted) {
    	Arrays.sort(unsorted, new Comparator<String>() {
    		@Override
    		public int compare(String a, String b) {
    			// TODO Auto-generated method stub
    			return StringAsIntegerCompare(a,b);
    		}
		});
    	return unsorted;
    }
    
    static int StringAsIntegerCompare(String s1, String s2)
    {
        if(s1.length() > s2.length()) return 1;
        if(s1.length() < s2.length()) return -1;
        for(int i = 0; i < s1.length(); i++)
        {
            if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
            if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
        }
        return 0;
    }
}
