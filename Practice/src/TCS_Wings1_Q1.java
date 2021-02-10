import java.util.*;
public class TCS_Wings1_Q1 {

	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Taking the input from user
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(maxProfit(arr, n));

	}
	
	private static int maxProfit(int[] arr, int n) {
		List<Integer> profitList = new ArrayList<Integer>();
		int profit = arr[0];
		for (int i = 1; i < n; i++) {
			if(arr[i] > arr[i - 1]) {
				profit = profit + arr[i];
			} else {
				profitList.add(profit);
				profit = arr[i];
			}
			if(i == n - 1) profitList.add(profit);
				
		}
		Collections.sort(profitList, Collections.reverseOrder());
		return profitList.get(0);
	}

}
