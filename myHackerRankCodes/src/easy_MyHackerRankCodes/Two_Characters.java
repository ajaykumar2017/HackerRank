package easy_MyHackerRankCodes;

import java.util.*;

public class Two_Characters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		int n = sc.nextInt(); //length of s
		String s = sc.next(); //String s
		int result = alternate(s);
		System.out.println(result);
		
	} 
	
	private static int alternate  (String s){
		if(s.length()==2){
            if(s.charAt(0)!=s.charAt(1)){
                return 2;
            }
        }
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		//finding distinct elements of the string
		List<Character> distinct = distinctElementsOfAnArray(ch);
		//Now we check the length of the string for every combination of two distinct characters 
		//we will remove every distinct characters except two one by one
		int maxlength = 0, index = 0;
		for(int i=0; i<distinct.size(); i++) {
			char a = distinct.get(i);
			for(int j=i+1; j<distinct.size(); j++) {
				char b = distinct.get(j);
				String t = formString(a, b, s);
                if(checkT(t)==true){
                    if(t.length()>maxlength){
                    	maxlength = t.length();
                    } 
                } 
			}
		}
		return maxlength;
	}
    private static boolean checkT(String s){
        boolean a = false;
           int count = 0;
           for(int i=0;i<s.length()-2;i++){
           if(s.charAt(i)==s.charAt(i+2)){
               count++;
               a = true;  
           }else{
              a = false; 
           }
           }
               if((count == s.length()-2) && (a==true) ){
                   return true;
               }
           return false;    
           }
	private static String formString(char a, char b, String s) {
		String str = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == a || s.charAt(i) == b)
				str+=s.charAt(i);
		}
		return str;
	}
	private static List<Character> distinctElementsOfAnArray(char[] arr) {
		List<Character> distinct=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) 
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
		return distinct;
	}
}
