package easy_MyHackerRankCodes;

import java.util.*;

public class Caesar_Cipher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		int n = sc.nextInt(); // the length of the unencrypted string.
		String s = sc.next(); //the unencrypted string
		int k = sc.nextInt(); //the number of letters to rotate the alphabet by.
		String result = caesarCipher(s, k);
		System.out.println(result);
		
	} 
	
	private static String caesarCipher (String s, int k){
		int k1 = k % 26;
		String result = "";
		for (int i=0; i<s.length(); i++) {
			//Checking For Uppercase
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				char ch = (char) (s.charAt(i)+k1);
				if(ch>'Z')
					ch = (char) (ch-26);
				result = result + ch;
			} else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				char ch = (char) (s.charAt(i)+k1);
				if(ch>'z')
					ch = (char) (ch-26);
				result = result + ch;
			} else {
				result = result + s.charAt(i);
			}
		}
		return result;
	}
}
