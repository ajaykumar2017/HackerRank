package easy_MyHackerRankCodes;

import java.util.Scanner;

public class Insertion_Sort_Part_2 {

	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		insertionSort2(n, arr);
	}
	

	
	private static void insertionSort2(int n, int[] intArray) {
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
	            firstUnsortedIndex++) {

	            int element = intArray[firstUnsortedIndex];

	            int i;

	            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > element; i--) {

	                intArray[i] = intArray[i - 1];
	            }

	            intArray[i] = element;
	            
	            for (int k = 0; k < intArray.length; k++) {
	                System.out.print(intArray[k] + " ");
	            }
	            System.out.println();
	        }
	}

}
