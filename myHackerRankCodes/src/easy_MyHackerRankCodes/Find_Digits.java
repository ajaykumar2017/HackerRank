package easy_MyHackerRankCodes;
import java.util.*;

import easy_MyHackerRankCodes.DistinctElementsOfAnArray;

public class Find_Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); //number of test cases
		int[] n = new int[t];
		for(int i=0; i<t; i++) {
			n[i]=sc.nextInt();
		}
		for(int i=0; i<t; i++) {
			System.out.println(findDigits(n[i]));
		}
	}
	
	static int findDigits(int n) {
		String number = String.valueOf(n);
		int count = 0;
		for(int i=0; i<number.length(); i++) {
			if(number.charAt(i)!='0') {
				if(n%Integer.parseInt(String.valueOf(number.charAt(i)))==0)
					count++;
			}
		}
		return count;
	}
}
