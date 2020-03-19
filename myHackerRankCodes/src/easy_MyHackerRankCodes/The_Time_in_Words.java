package easy_MyHackerRankCodes;

import java.util.Scanner;

public class The_Time_in_Words {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		sc.nextLine();
		int m=sc.nextInt();
		String result=timeInWords(h, m);
		System.out.println(result);
	}
	
	static String timeInWords(int h, int m) {
		String nums[] = { "zero", "one", "two", "three", "four", 
                "five", "six", "seven", "eight", "nine", 
                "ten", "eleven", "twelve", "thirteen", 
                "fourteen", "fifteen", "sixteen", "seventeen", 
                "eighteen", "nineteen", "twenty", "twenty one", 
                "twenty two", "twenty three", "twenty four", 
                "twenty five", "twenty six", "twenty seven", 
                "twenty eight", "twenty nine", 
            };
		String result="";

		if (m == 0) 
			result=(nums[h] + " o' clock "); 
		
		else if (m == 1) 
			result=("one minute past " +  
		                                nums[h]); 
		
		else if (m == 59) 
			result=("one minute to " +  
		                nums[(h % 12) + 1]); 
		
		else if (m == 15) 
			result=("quarter past " + nums[h]); 
		
		else if (m == 30) 
			result=("half past " + nums[h]); 
		
		else if (m == 45) 
			result=("quarter to " +  
		                    nums[(h % 12) + 1]); 
		
		else if (m <= 30) 
			result=( nums[m] + " minutes past " + 
		                                        nums[h]); 
		
		else if (m > 30) 
			result=( nums[60 - m] + " minutes to " +      
                                    nums[(h % 12) + 1]); 
		return result;

    }
}
