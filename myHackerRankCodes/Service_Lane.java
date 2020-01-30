package myHackerRankCodes;
import java.util.*;
public class Service_Lane {
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //number of width measurements 
		int t = sc.nextInt(); //number of test cases
		int[] width = new int[n];
		for(int i=0; i<n; i++) {
			width[i]=sc.nextInt();
		}
		int[][] cases=new int[t][2];
		for(int i=0; i<t; i++) {
			cases[i][0]=sc.nextInt();
			cases[i][1]=sc.nextInt();
		}
		
		//output
		int[] result = serviceLane(t, cases, width);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	
	private static int[] serviceLane(int t, int[][] cases, int[] width) {
		int[] result = new int[t];
		for(int i=0; i<t; i++) {
			int j=cases[i][0];
			int min=width[j];
			while(j<=cases[i][1]) {
				if(min>width[j])
					min = width[j];
				j++;
			}
			result[i] = min;
		}
		return result;
		
		
	}
}
