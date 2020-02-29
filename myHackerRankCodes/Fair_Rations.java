package myHackerRankCodes;

import java.util.*;

public class Fair_Rations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		int n = sc.nextInt(); // the number of subjects in bread line
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		String result = fairRations(b);
		System.out.println(result);
	}

	private static String fairRations(int[] arr) {
		int n = arr.length;
		int bread_given = 0;
		for (int i=0; i<n-1; i++) {
			if(arr[i]%2!=0) {
				arr[i]++;
				arr[i+1]++;
				bread_given+=2;
			}
		}
		if(arr[n-1]%2==0) {
			return String.valueOf(bread_given);
		} else {
			return "NO";
		}
	}
}
