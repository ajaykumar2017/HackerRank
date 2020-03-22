package easy_MyHackerRankCodes;

import java.util.*;
public class Gemstones {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//Taking input
		int n = scanner.nextInt();//the size of the array
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = scanner.next();
		}
		//Showing output
		int result = gemstones(arr);
		System.out.println(result);
	}
    private static int gemstones(String[] arr) {
    	int numGemStones = 0;
    	//Find distinct characters of the first String of the String array
    	String distinct_arr_0 = distinctCharacterssOfString(arr[0]);
    	int[] count = new int[distinct_arr_0.length()];
    	for(int i=0; i<distinct_arr_0.length(); i++) {
    		//Now each distinct characters should be checked whether it contains in all strings or not
			char temp = distinct_arr_0.charAt(i);
    		for(int j=1; j<arr.length; j++) {
    			//If the character is not present in any of the string then we make it to 1
    			if(!(arr[j].contains(String.valueOf(temp)))) {
	    			count[i] = 1;
	    			break;
	    		}
    		}
    	}
    	for(int i=0; i<count.length; i++) {
    		//we count total number of gemStones as value is 0 which is not changed in the array
    		if(count[i] == 0) {
    			numGemStones++;
    		}
    	}
    	return numGemStones;
    }
	private static String distinctCharacterssOfString(String s) {
		StringBuffer sb = new StringBuffer(s);
	    for (int i = 0; i < sb.length()-1; i++) {
	        for (int j = i + 1; j < sb.length(); j++) {
	          if (sb.charAt(i) == sb.charAt(j)) {
	            sb.deleteCharAt(j);
	            j--;
	          }
	        }
	      }
	    return sb.toString();
	}

}

