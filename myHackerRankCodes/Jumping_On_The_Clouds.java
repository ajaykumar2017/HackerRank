package myHackerRankCodes;

import java.util.*;

public class Jumping_On_The_Clouds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input
		int n = sc.nextInt(); //the total number of clouds
		int[] c = new int[n];
		//The second line contains n space-separated binary integers describing 
		for(int i=0; i<n; i++) {
			c[i] = sc.nextInt();
		}
		//output
		int result = jumpingOnClouds(c);
	}
	
	private static int jumpingOnClouds(int[] c) {
		int count = 0;
		for(int i=0; i<c.length; i++) {
			   
		}
	}
}
