package easy_MyHackerRankCodes;

import java.util.*;

public class Mars_Exploration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		String s = sc.next(); //the unencrypted string
		//output
		int result = marsExploration(s);
		System.out.println(result);
		
	} 
	
	private static int marsExploration (String s){
		int count = 0;
		for(int i=0; i<(s.length()/3); i++) {
			if(s.charAt(3*i)!='S')
				count++;
			if(s.charAt(3*i+1)!='O')
				count++;
			if(s.charAt(3*i+2)!='S')
				count++;
		}
		return count;
	}
}
