package easy_MyHackerRankCodes;

import java.util.*;

public class Beautiful_Binary_String {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//Input
		int n = scanner.nextInt(); //The Length of the Binary String
		String b = scanner.next(); //The Binary String
		
		//Output
		int result = beautifulBinaryString(b);
		System.out.println(result);
	}
	
    private static int beautifulBinaryString(String b) {
    	//We are counting number of occurences of "010" in the String
    	return (b.length() - b.replaceAll("010", "").length())/3;
    }
}
