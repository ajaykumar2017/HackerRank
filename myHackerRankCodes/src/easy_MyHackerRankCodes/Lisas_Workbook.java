package easy_MyHackerRankCodes;

import java.util.Scanner;

public class Lisas_Workbook {
	public static void main(String[] args) {
		//input
		//first line contains two integers
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //number of chapters 
		int k = sc.nextInt(); //maximum number of problems per page.
		/**
		 * second line contains n space-separated integers where arr[i] denotes the
		 * number of problems in then ith page
		 */
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		//output
		int result = workbook(n, k, arr);
		System.out.println(result);
		
		
		
	}
	
	private static int workbook(int n, int k, int[] arr) {
		int count = 0;
		int page=1;
		for(int a : arr) {
			for(int i=1; i<=a; i++) {
				if(i==page) count++;
				if(i%k==0) page++;
			}
			if(a%k!=0) page++;
		}
		return count;
	}
}
