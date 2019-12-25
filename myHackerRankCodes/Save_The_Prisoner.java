package myHackerRankCodes;

import java.util.*;

public class Save_The_Prisoner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int chairNo = saveThePrisoner(n, m, s);
			System.out.println(chairNo);
		}

	}

	public static int saveThePrisoner(int n, int m, int s) {
		int res = 0;
		if (s + m - 1 < n)
			res = s + m - 1;
		else if (s + m - 1 > n) {
			int temp = m % n;
			int temp1 = m - temp;
			res = s + m - 1 - temp1;
		}
		return res;
	}
}
