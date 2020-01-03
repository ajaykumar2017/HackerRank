package myHackerRankCodes;

import java.math.BigInteger;
import java.util.*;

public class Repeated_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long n = sc.nextLong();
		long result = repeatedString(s, n);
		System.out.println(result);
	}
	
	private static long repeatedString(String s, long n) {
		//Step 1: count no of a in the string
		//Step 2: n = n/s.length();
		//Step 3: For ocuurence res1=count*n
		//Step 4: Find the a's occurence till v=n%s.length() then we have res2
		//Step 5: For total occurences add result=res1+res2
		long str_len = s.length();
		long temp = n/str_len;
		long count = 0;
		if(!s.contains("a")) {
            count=0;
        }
		else if(str_len == 1) {
			count = n;
		} else if(n>str_len) {
			for (int i=0; i<str_len; i++) {
				if(s.charAt(i)=='a') {
					count++;
				}
			}
			count = count*temp;
		}
			
		long temp1 = n%str_len;
		for (int i=0; i<temp1; i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		return count;
	}
}
