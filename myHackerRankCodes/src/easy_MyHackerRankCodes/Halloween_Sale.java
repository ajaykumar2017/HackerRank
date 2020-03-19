package easy_MyHackerRankCodes;
import java.util.*;
public class Halloween_Sale {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int d=sc.nextInt();
		int m=sc.nextInt();
		int s=sc.nextInt();
		int result=howManyGames(p, d, m, s);
		System.out.println(result);
	}
	
	static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int sum=0;
        List<Integer> list=new ArrayList<>();
        while(true) {
        	sum=sum+p;
        	if(sum<=s)
        		list.add(p);
        	else
        		break;
        	if(p-m>=d)
        		p=p-d;
        	else
        		p=m;
        }
        return list.size();
    }
}
