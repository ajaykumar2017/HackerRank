package easy_MyHackerRankCodes;

import java.util.*;

public class Circular_Array_Rotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * The first line contains 3 space-separated integers n, k and q, the number of
		 * elements in the integer array, the rotation count and the number of queries.
		 */
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		sc.nextLine();
		/**
		 * The second line contains n space-separated integers, where each integer i
		 * describes array element a[i] (where 0<=i<n ). Each of the q subsequent lines
		 * contains a single integer denoting m, the index of the element to return from
		 * .
		 */
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.nextLine();

		int[] queries = new int[q];
		for (int i = 0; i < q; i++) {
			queries[i] = sc.nextInt();
		}
		// printing the result
		int[] result = circularArrayRotation(a, k, queries);

		for (int j = 0; j < result.length; j++) {
			System.out.println(result[j]);
		}
	}

	private static int[] circularArrayRotation(int[] a, int k, int[] queries) {
		int n = a.length;
		int[] res = new int[queries.length];
		int[] b = new int[a.length];
		int i = 0;
		// Rotating the array k times
		/*
		 * if(k>a.length) k = k%a.length; for (int i = 0; i < k; i++) { int temp =
		 * a[a.length - 1]; for (int j = a.length-1; j >= 0; j--) { if(j>0) { a[j] =
		 * a[j-1]; } if(j==0) { a[j] = temp ; } } }
		 */
		if(k>n)
			k=k%n;
		for(int b_i=(Math.abs(n-k));b_i<n;b_i++)
		{
		b[i]=a[b_i];
		i++;
		}
		for(int b_i=0;b_i<(Math.abs(n-k));b_i++)
		{
		b[i]=a[b_i];
		i++;
		}
		
		for(int j = 0 ;j<queries.length ; j++) {
			res[j] = b[queries[j]];
		}
		return res;

	}
}
