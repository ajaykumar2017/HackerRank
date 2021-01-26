package easy_MyHackerRankCodes;

import java.util.*;
import java.util.Map.*;

public class Missing_Numbers {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking the input from the user
		int n = scanner.nextInt(); // the size of the first list arr
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int m = scanner.nextInt(); // the size of the second list brr
		int[] brr = new int[m];
		for (int i = 0; i < m; i++) {
			brr[i] = scanner.nextInt();
		}

		// Showing the result
		int[] result = missingNumbers(arr, brr);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] missingNumbers(int[] arr, int[] brr) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		//Counting Frequency of 1st Array
		HashMap<Integer, Integer> freqArrMap = countFreq(arr, arr.length);
		//Counting Frequency of 2nd Array
		HashMap<Integer, Integer> freqBrrMap = countFreq(brr, brr.length);
		
		for (Entry<Integer, Integer> entry : freqBrrMap.entrySet()) {
			if(isKeyPresent(freqArrMap, entry.getKey())) {
				if(freqArrMap.get(entry.getKey()) < freqBrrMap.get(entry.getKey())) {
					res.add(entry.getKey());
				}
			} else {
				res.add(entry.getKey());
			}
		}
		
    	int[] result = new int[res.size()];
    	for(int i = 0; i < res.size(); i++) {
    		result[i] = res.get(i);
    	}
    	return result;
		
	}

	// Method to check whether a key is present in HashMap
	private static boolean isKeyPresent(HashMap<Integer, Integer> map, int keyToBeChecked) {
		Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

		// flag to store result
		boolean isKeyPresent = false;

		// Iterate over the HashMap
		while (iterator.hasNext()) {

			// Get the entry at this iteration
			Entry<Integer, Integer> entry = iterator.next();

			// Check if this key is the required key
			if (keyToBeChecked == entry.getKey()) {

				isKeyPresent = true;
			}
		}
		return isKeyPresent;
	}
	
	// Method to find the frequency of elements in an array
	private static HashMap<Integer, Integer> countFreq(int arr[], int n) 
	{ 
		HashMap<Integer, Integer> freqArrMap = new HashMap<Integer, Integer>();
	    boolean visited[] = new boolean[n]; 
	      
	    Arrays.fill(visited, false); 
	  
	    // Traverse through array elements and 
	    // count frequencies 
	    for (int i = 0; i < n; i++) { 
	  
	        // Skip this element if already processed 
	        if (visited[i] == true) 
	            continue; 
	  
	        // Count frequency 
	        int count = 1; 
	        for (int j = i + 1; j < n; j++) { 
	            if (arr[i] == arr[j]) { 
	                visited[j] = true; 
	                count++; 
	            } 
	        } 
	        freqArrMap.put(arr[i], count); 
	    } 
	    return freqArrMap;
	} 

}
