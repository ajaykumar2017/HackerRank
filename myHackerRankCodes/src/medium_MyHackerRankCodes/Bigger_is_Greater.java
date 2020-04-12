package medium_MyHackerRankCodes;

import java.util.Scanner;

public class Bigger_is_Greater {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// input
		int t = scanner.nextInt(); // The number of text cases
		for (int i = 0; i < t; i++) {
			String w = scanner.next();
			String result = biggerIsGreater(w);
			System.out.println(result);
		}
		scanner.close();
	}

	private static String biggerIsGreater(String w) {
		// Case I: Check if all characters of the string are same
		String result = null;
		if (allCharactersSame(w)) {
			return "no answer";
		} else {
			result = nextPermutation(w);
		}
		return result;
	}

	private static String nextPermutation(String w) {
	    // Find longest non-increasing suffix
		char[] array = w.toCharArray();
	    int i = array.length - 1;
	    while (i > 0 && array[i - 1] >= array[i])
	        i--;
	    // Now i is the head index of the suffix
	    
	    // Are we at the last permutation already?
	    if (i <= 0)
	        return "no answer";
	    
	    // Let array[i - 1] be the pivot
	    // Find rightmost element that exceeds the pivot
	    int j = array.length - 1;
	    while (array[j] <= array[i - 1])
	        j--;
	    // Now the value array[j] will become the new pivot
	    // Assertion: j >= i
	    
	    // Swap the pivot with j
	    char temp = array[i - 1];
	    array[i - 1] = array[j];
	    array[j] = temp;
	    
	    // Reverse the suffix
	    j = array.length - 1;
	    while (i < j) {
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	        i++;
	        j--;
	    }
	    
	    // Successfully computed the next permutation
	    return String.valueOf(array);
	}

	private static boolean allCharactersSame(String s) {
		int n = s.length();
		for (int i = 1; i < n; i++)
			if (s.charAt(i) != s.charAt(0))
				return false;
		return true;
	}

}
