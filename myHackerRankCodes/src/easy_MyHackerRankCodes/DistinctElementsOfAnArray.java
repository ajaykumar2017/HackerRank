package easy_MyHackerRankCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistinctElementsOfAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		List<Integer> arr=new ArrayList<Integer>();
		sc.nextLine();
		for(int i=0; i<length; i++) {
			arr.add(sc.nextInt());
		}
		List<Integer> distinct = distinctElementsOfAnArray(arr);
		for(int i=0;i<distinct.size(); i++) {
			System.out.println(distinct.get(i));
		}
	}
	public static List<Integer> distinctElementsOfAnArray(List<Integer> arr) {
		List<Integer> distinct=new ArrayList<>();
		for (int i = 0; i < arr.size(); i++) 
        { 
            // Check if the picked element  
            // is already printed 
            int j; 
            for (j = 0; j < i; j++) 
            	if (arr.get(i) == arr.get(j)) 
            		break; 
      
            // If not printed earlier,  
            // then print it 
            if (i == j) 
            	distinct.add(arr.get(i)); 
        }
		return distinct;
	}
}
