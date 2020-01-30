package myHackerRankCodes;

import java.util.*;

public class Jumping_On_The_Clouds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input
		int n = sc.nextInt(); //the total number of clouds
		int k = sc.nextInt(); //the jump distance
		int[] c = new int[n];
		//The second line contains n space-separated binary integers describing 
		for(int i=0; i<n; i++) {
			c[i] = sc.nextInt();
		}
		//output
		int result = jumpingOnClouds(c, k);
		System.out.println(result);
	}
	
	private static int jumpingOnClouds(int[] c, int k) {
		int count = 0;
		int e = 100;
		int i = 0;
		while(i<c.length) {
			   if(c[i]==1) {
				   i+=k;
				   e=e-1-2;
			   } else {
				  i+=k;
				  e-=1;
			   }
		}
		return e;	
	}
}
