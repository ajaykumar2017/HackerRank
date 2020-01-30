package myHackerRankCodes;
import myHackerRankCodes.DistinctElementsOfAnArray;
import java.util.*;

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
	
	private static int findDigits(int n) {
		List<Integer> digits = new ArrayList<>();
		while(n>0) {
			int temp = n%10;
			digits.add(temp);
			n=n/10;
		}
		
		//Finding the digits
		int count =0 ;
		for(int i=0; i<digits.size(); i++) {
			if(digits.get(i)!=0) {
				if(n%digits.get(i)==0)
					count++;
			}
		}
		return count;
	}
}
