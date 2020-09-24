package easy_MyHackerRankCodes;

import java.util.*;

public class Strange_Counter {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking input from user
		long t = scanner.nextLong();
		// Showing output
		long result = strangeCounter(t);
		System.out.println(result);
	}

	private static long strangeCounter(long t) {
		long result= 0;
		for(long i = 1; ; i++) {
			if(t < (3*(long)Math.pow(2, i)- 2)) {
				long upperValue = 3*(long)Math.pow(2, i - 1);
				long upperTime = upperValue - 2;
				result = upperValue - (t - upperTime);
				break;
			}
		}
		return result;
    }

}
