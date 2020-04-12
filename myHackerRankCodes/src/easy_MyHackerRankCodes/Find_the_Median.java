package easy_MyHackerRankCodes;

import java.util.*;

public class Find_the_Median {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//input
		int n = scanner.nextInt(); //Integer n the size of the array
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		int result = findMedian(arr);
		System.out.println(result);
		scanner.close();
	}
	
	private static int findMedian(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length/2];
    } 
}
