package myHackerRankCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistinctElementsOfAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int[] arr=new int[length];
		sc.nextLine();
		for(int i=0; i<length; i++) {
			arr[i]=sc.nextInt();
		}
		
		List<Integer> distinct=new ArrayList<>();
		for (int i = 0; i < length; i++) 
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
		
		
		for(int i=0;i<distinct.size(); i++) {
			System.out.println(distinct.get(i));
		}
	}
}
