package myHackerRankCodes;
import java.util.*;
public class Minimum_Distances {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		int[] a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		int result=minimumDistances(a);
		System.out.println(result);
		
	}
	 static int minimumDistances(int[] a) {
		 int ans=Integer.MAX_VALUE;
		 for(int i=0; i<a.length; i++) {
			 for(int j=i+1; j<a.length; j++) {
				 if(a[i]==a[j]) {
					 ans=Integer.min(ans, j-i);
				 }
			 }
		 }
		 return ans==Integer.MAX_VALUE?-1:ans;

	 }

}
