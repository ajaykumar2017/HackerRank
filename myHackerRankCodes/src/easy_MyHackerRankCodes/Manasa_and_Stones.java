package easy_MyHackerRankCodes;
import java.util.*;
public class Manasa_and_Stones {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//Taking input from user
		int t = scanner.nextInt(); //The number of test cases
		//The next q lines will each contain a string s.
		for(int i=0; i<t; i++) {
			int n = scanner.nextInt(); //the number of non-zero stones found.
			int a = scanner.nextInt(); //one possible difference
			int b = scanner.nextInt(); //the other possible difference.
			//Showing the output
			int[] result = stones(n, a, b);
			for(int j=0; j<result.length; j++) {
				System.out.print(result[j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
	
    private static int[] stones(int n, int a, int b) {
    	List<Integer> possibleStones = new ArrayList<>();
		int temp_a[] = new int[n-1];
		for(int j=0; j<n-1; j++) {
			temp_a[j] = a;
		}
		int temp_b[] = new int[n-1];
		for(int j=0; j<n-1; j++) {
			temp_b[j] = b;
		}
    	for(int i=0; i<n-1; i++) {
    		temp_a[n-2-i] = b;
    		int[] values_a = new int[n];
    		for(int j=1; j<n; j++) {
    			values_a[j] = values_a[j-1] + temp_a[j-1];
    		}
    		possibleStones.add(values_a[n-1]);
    		temp_b[n-2-i] = a;
    		int[] values_b = new int[n];
    		for(int j=1; j<n; j++) {
    			values_b[j] = values_b[j-1] + temp_b[j-1];
    		}
    		possibleStones.add(values_b[n-1]);
    	}
    	Collections.sort(possibleStones);
    	int[] possibleStonesArray = new int[possibleStones.size()];
    	for(int i=0; i<possibleStones.size(); i++) {
    		possibleStonesArray[i] = possibleStones.get(i);
    	}
    	return distinctElementsOfAnArray(possibleStonesArray);
    }
    
	public static int[] distinctElementsOfAnArray(int[] arr) {
		List<Integer> distinct=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) 
        { 
            // Check if the picked element  
            // is already printed 
            int j; 
            for (j = 0; j < i; j++) 
            	if (arr[i] == arr[j]) 
            		break; 
      
            // If not printed earlier,  
            // then print it 
            if (i == j) 
            	distinct.add(arr[i]); 
        }
		int[] distinctInt = new int[distinct.size()];
		for(int i=0; i<distinct.size(); i++) {
			distinctInt[i] = distinct.get(i);
		}
		return distinctInt;
	}
}
