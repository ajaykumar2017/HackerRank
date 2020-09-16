package easy_MyHackerRankCodes;
import java.util.*;

public class Modified_Kaprekar_Numbers {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking input from user
		int p = scanner.nextInt();
		int q = scanner.nextInt();
		
		//calling the method kaprekarNumbers
		kaprekarNumbers(p, q);
	}
	
	private static void kaprekarNumbers(long p, long q) {
		List<Long> arr = new ArrayList<>();
		for(long n = p; n <= q; n++) {
			int d = String.valueOf(n).length();
			long nsq = n * n;
			if(String.valueOf(nsq).length() > 1) {
				long r = String.valueOf(nsq).length() == 2 * d ? 
						Long.parseLong(String.valueOf(nsq).substring(d, 2 * d)) : 
							Long.parseLong(String.valueOf(nsq).substring(d-1, 2 * d - 1));
				long l = String.valueOf(nsq).length() == 2 * d ? 
						Long.parseLong(String.valueOf(nsq).substring(0, d)) : 
							Long.parseLong(String.valueOf(nsq).substring(0, d - 1));
				if(r + l == n) {
					arr.add(n);
				}
			} else if(n == nsq) {
				arr.add(n);
			}
		}
		if(!arr.isEmpty()) {
	        for(int n=0; n<arr.size(); n++) {
	            System.out.print(arr.get(n) + " ");
	        }
		} else {
			System.out.println("INVALID RANGE");
		}

    }

}
