package easy_MyHackerRankCodes;

import java.util.Scanner;

public class Intro_to_Tutorial_Challenges {
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int v = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(introTutorial(v, arr));
	}
	
    private static int introTutorial(int v, int[] arr) {
    	return binarySearch(arr, 0, arr.length - 1, v);
    }
    
    private static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 

}
