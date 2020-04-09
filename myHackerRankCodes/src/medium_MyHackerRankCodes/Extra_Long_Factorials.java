package medium_MyHackerRankCodes;

import java.math.BigInteger;
import java.util.*;

public class Extra_Long_Factorials {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//Taking input from user
		int n = scanner.nextInt();
		extraLongFactorials(n);
	}
	private static void extraLongFactorials(int n) {
		// Initialize result 
		BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
		  
		// Multiply f with 2, 3, ...N 
		for (int i = 2; i <= n; i++) 
			f = f.multiply(BigInteger.valueOf(i)); 
		System.out.println(f);
		return;
    }
}
