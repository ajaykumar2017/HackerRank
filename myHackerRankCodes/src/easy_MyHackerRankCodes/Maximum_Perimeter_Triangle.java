package easy_MyHackerRankCodes;

import java.util.*;

public class Maximum_Perimeter_Triangle {

	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int j = 0; j < n; j++) {
			arr[j] = scanner.nextInt();
		}
		int[] result = maximumPerimeterTriangle(arr);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
    private static int[] maximumPerimeterTriangle(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        long sum = 0;
        int[] sides = new int[3];
        int[] temp = {-1};
        boolean isSidesChanged = false;
        for(int i = 0; i < n - 2; i++) {
            if(arr[i] + arr[i + 1] > arr[i + 2]) {
            	long tmp = (long)arr[i] + arr[i + 1] + arr[i + 2];
                if(sum < tmp) {
                    sum = tmp;
                    sides[0] = arr[i];
                    sides[1] = arr[i + 1];
                    sides[2] = arr[i + 2];
                    isSidesChanged = true;
                }
            }
        }
        Arrays.sort(sides);
        return isSidesChanged ? sides : temp;

    }
}
