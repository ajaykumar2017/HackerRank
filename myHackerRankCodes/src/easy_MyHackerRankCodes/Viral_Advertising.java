package easy_MyHackerRankCodes;
import java.util.*;
public class Viral_Advertising {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result= viralAdvertising(n);
		System.out.println(result);
	}
	public static int viralAdvertising(int n) {
		int shared=5;
		int liked=0;
		int cumulative=0;
		for(int i=0; i<n; i++) {
			liked=shared/2;
			shared=liked*3;
			cumulative=cumulative+liked;
		}
		return cumulative;
	}
}
