package easy_MyHackerRankCodes;
import java.util.*;
public class NonDivisibleSubset {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		sc.nextLine();
		List<Integer> s=new ArrayList<>();
		for(int i=0; i<n; i++) {
			s.add(sc.nextInt());
		}
		int result= nonDivisibleSubset(k,s);
		
		System.out.println(result);
		 }
	
	static int nonDivisibleSubset(int k, List<Integer> s) {
		List<Integer> result=new ArrayList<>();
		for(int i=0; i<s.size()-1; i++) {
			if((s.get(i)+s.get(i+1))%k!=0) {
				result.add(s.get(i));
			}
			for(int j=i+1; j<s.size(); j++) {
				if((s.get(i)+s.get(j))%k!=0&&!(result.contains(s.get(j)))) {
					result.add(s.get(j));
				}
			}
		}
	  return result.size();
	}

}
