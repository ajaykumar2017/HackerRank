package easy_MyHackerRankCodes;

import java.util.Scanner;

public class Insertion_Sort_Part_1 {

	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		insertionSort1(n, arr);
	}

	private static void insertionSort1(int n, int[] arr) {
		
		int element = arr[arr.length - 1];
		
		int i;
		
		for (i = arr.length - 1; i > 0 && arr[i - 1] > element; i--) {
			
				arr[i] = arr[i - 1];
				
			for (int k = 0; k < n; k++) {
				System.out.print(arr[k] + " ");
			}
			
			System.out.println();
		}
		
		arr[i] = element;
		
		for (int k = 0; k < n; k++) {
			
			System.out.print(arr[k] + " ");
		}
	}

}
