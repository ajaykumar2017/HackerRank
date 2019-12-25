package myHackerRankCodes;
import java.util.*;
public class Beautiful_Days_At_The_Movies {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		int result=beautifulDays(i, j ,k);
		System.out.println(result);
	}
	
	public static int beautifulDays(int i, int j, int k) {
		int count=0;
		for(int p=i; p<=j; p++) {
			if(Math.abs(p-reverse(p))%k==0)
				count++;
		}
		return count;
	}
	
	public static int reverse(int n) {
		int reverse=0;
		while(n>0) {
			int num = n%10;
			reverse=reverse*10+num;
			n=n/10;
		}
		return reverse;
	}
}
