package easy_MyHackerRankCodes;
import java.util.*;

public class Ice_Cream_Parlor {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Taking the input
		int t = scanner.nextInt(); //number of trips to the ice cream parlor
		for(int i = 0; i < t; i++) {
			int m = scanner.nextInt(); //the amount of money they have pooled.
			int n = scanner.nextInt(); //the number of flavors offered at the time.
			int[] arr = new int[n];
			String[] strItems = scanner.nextLine().split(" ");
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(strItems[j]);
			}
			int[] result = icecreamParlor(m, arr);
			for(int j = 0; j < result.length; j++) {
				System.out.println(result[j]);
			}
		}
	}
	
    private static int[] icecreamParlor(int m, int[] arr) {
    	int[] result = new int[2];
    	for(int i = 0; i < arr.length-1; i++) {
    		for(int j = i+1; j < arr.length; j++) {
    			if(arr[i] + arr[j] == m) {
    				result[0] = i+1;
    				result[1] = j+1;
    			}
    		}
    	}
    	return result;
    }

}
