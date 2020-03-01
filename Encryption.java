package myHackerRankCodes;

import java.util.*;

public class Encryption {
	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		Scanner sc = new Scanner(System.in);
		// input
		String s = sc.nextLine();
		String result = encryption(s);
		System.out.println(result);
		
	} 
	
	private static String encryption (String s){
		String str = s.replaceAll("\\s", ""); //replace all white spaces 
		int row = (int) Math.round((double)Math.sqrt(str.length()));
		int column = (int) Math.ceil((double)Math.sqrt(str.length()));
		char[][] ch = new char[row][column];
		int index = 0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if(index<str.length())
					ch[i][j] = str.charAt(index++);}
		}
		/*
		 * for(int i=0; i<row; i++) { for(int j=0; j<column; j++) {
		 * System.out.print(ch[i][j]); } System.out.println(); }
		 */
		String result = "";
		for(int i=0; i<column; i++) {
			for(int j=0; j<row; j++) {
				if(ch[j][i]>=97 && ch[j][i]<=122)
					result =result + ch[j][i];
			}
			result = result + " " ;
		}
		return result;
	}
}
