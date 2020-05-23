package easy_MyHackerRankCodes;

import java.util.*;

public class Taum_And_Bday {
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking the input from user
		int t = scanner.nextInt(); // The number of test cases
		for (int i = 0; i < t; i++) {
			long b = scanner.nextInt();
			long w = scanner.nextInt();
			long bc = scanner.nextInt();
			long wc = scanner.nextInt();
			long z = scanner.nextInt();
			long result = taumBday(b, w, bc, wc, z);
			//Showing output for each test case
			System.out.println(result);
		}
	}

	public static long taumBday(long b, long w, long bc, long wc, long z) {
		return b * Math.min(bc, wc + z) + w * Math.min(wc, bc + z);
	}
}
