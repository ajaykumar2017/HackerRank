package easy_MyHackerRankCodes;
import java.util.*;
public class Grid_Challenge {

	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// input
		int t = scanner.nextInt();
		for(int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			String[] arr = new String[n];
			for(int j = 0; j < n; j++) {
				arr[j] = scanner.next();
			}
			String result = gridChallenge(arr);
			System.out.println(result);
		}

	}
	
    private static String gridChallenge(String[] grid) {
        int n = grid.length;
        String[] newstr = new String[n];
        for(int i = 0; i < n; i++) {
            char[] temp = grid[i].toCharArray();
            Arrays.sort(temp);
            newstr[i] = new String(temp);
        }
        
        for(int i =0; i < n - 1; i++) {
            for(int j = 0; j < newstr[i].length(); j++) {
                if(!(newstr[i].charAt(j) <= newstr[i + 1].charAt(j)))
                    return "NO";
            }
        }
        return "YES";
    }

}
