package hard_MyHackerRankCodes;

import java.util.*;

public class MaximumSubarraySum {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking the input from the user
		int q = scanner.nextInt(); // the number of test cases
		for (int i = 0; i < q; i++) {
			int n = scanner.nextInt(); // the number of elements in the array
			long m = scanner.nextLong(); // modulo divisor
			long[] arr = new long[n];
			for (int j = 0; j < n; j++) {
				arr[j] = scanner.nextLong();
			}
			// Showing the output
			long result = maximumSum(arr, m);
			System.out.println(result);
		}
	}

	static long maximumSum(long[] a, long m) {
        long maxSum=0;
      
        TreeSet<Long> prefix = new TreeSet<Long>();
        long currSum=0;

        for(int i=0;i<a.length;i++){
            currSum=(currSum+a[i]%m)%m;
            maxSum=Math.max(maxSum, currSum);
            
            Long pr = prefix.higher(currSum);
            if(pr != null){
                maxSum= Math.max(maxSum, (currSum-pr+m)%m);
            }
            prefix.add(currSum);
        }
        
        return maxSum;
    }

}
