package easy_MyHackerRankCodes;

import java.util.*;

public class Closest_Numbers {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt(); // the length of the array
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String[] str = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		int[] result = closestNumbers(arr);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] closestNumbers(int[] arr) {
		List<Integer> diff = new ArrayList<Integer>();
		Arrays.sort(arr);
    	for(int i = 0; i < arr.length - 1; i++) {
    		diff.add(Math.abs(arr[i] - arr[i + 1]));
    	}
    	
    	int minDifference = Collections.min(diff);
    	List<Integer> res = new ArrayList<Integer>();
    	
    	for(int i = 0; i < diff.size(); i++) {
    		if(diff.get(i) == minDifference) {
    			res.add(arr[i]);
    			res.add(arr[i+1]);
    		}
    	}
    	
    	int[] result = new int[res.size()];
    	for(int i = 0; i < res.size(); i++) {
    		result[i] = res.get(i);
    	}
    	return result;
    }

}
