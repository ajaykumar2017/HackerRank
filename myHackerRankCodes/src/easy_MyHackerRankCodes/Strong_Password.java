package easy_MyHackerRankCodes;
import java.util.*;
import java.util.regex.Pattern;

public class Strong_Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		int n = sc.nextInt();
		String str = sc.next();
		//output
		int result = minimumNumber(n, str);
		System.out.println(result);
	}
	
	
	/*
	 * Criteria
	 * Its length is at least 6. 
	 * It contains at least one digit. 
	 * It contains at least one lowercase English character.
	 * It contains at least one uppercase English character. 
	 * It contains at least one special character. The special characters are: !@#$%^&*()-+
	 */
	
	private static final Pattern[] inputRegexes = new Pattern[4];
	 
	static {
	    inputRegexes[0] = Pattern.compile(".*[A-Z].*");
	    inputRegexes[1] = Pattern.compile(".*[a-z].*");
	    inputRegexes[2] = Pattern.compile(".*\\d.*");
	    inputRegexes[3] = Pattern.compile(".*[!@#$%^&*()-+].*");
	}
	
    private static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
    	int count = 0;
    	for (Pattern inputRegex : inputRegexes) {
            if (!inputRegex.matcher(password).matches()) {
                count++;
            }
        }
    	if(n+count<6) {
    		int res = 6-count-n;
    		count+=res;
    	}
    	return count;
    }
	 
}
