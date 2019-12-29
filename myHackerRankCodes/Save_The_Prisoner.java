package myHackerRankCodes;

import java.util.*;

public class Save_The_Prisoner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int chairNo = saveThePrisoner(n, m, s);
			System.out.println(chairNo);
		}

	}

	public static int saveThePrisoner(int n, int m, int s) {
		int a = s+m-1;   
        if(a>n){
            if(a%n==0){
                return n;
            }
            return a%n;
        }
         return a;
	}
}
