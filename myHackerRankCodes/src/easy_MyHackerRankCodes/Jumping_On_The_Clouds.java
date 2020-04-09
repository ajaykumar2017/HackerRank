package easy_MyHackerRankCodes;

import java.util.*;

public class Jumping_On_The_Clouds {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//input
		int n = scanner.nextInt(); //the total number of clouds
		int[] c = new int[n];
		//The second line contains n space-separated binary integers describing 
		for(int i=0; i<n; i++) {
			c[i] = scanner.nextInt();
		}
		//output
		int result = jumpingOnClouds(c, n);
		System.out.println(result);
		scanner.close();
	}
	
	private static int jumpingOnClouds(int[] c, int n) {
		int count = 0;
		for(int i=0; i<n-1; ) {
			if(i<n-2 && c[i+2]!=1) {
				count++;
				i+=2;
			} else {
				count++;
				i++;
			}
		}
		return count;
	}
}
