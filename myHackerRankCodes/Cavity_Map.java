package myHackerRankCodes;

import java.util.*;

public class Cavity_Map {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		int n = sc.nextInt(); // the number of rows and columns in the map
		String[] grid = new String[n];
		for (int i = 0; i < n; i++) {
			grid[i] = sc.next();
		}
		String[] result = cavityMap(grid);
		for(int i=0; i<n; i++) {
			System.out.println(result[i]);
		}
		
	} 
	
	private static String[] cavityMap(String[] grid) {
		int n = grid.length;
		char[][] a = new char[n][n];
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = grid[i].charAt(j);
			}
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if( (i>=1)&&(i<n-1) && (j>=1)&&(j<n-1) )
		        {
		         if( (a[i][j] > a[i-1][j]) && (a[i][j] > a[i][j+1])      
		         && (a[i][j] > a[i+1][j]) && (a[i][j] > a[i][j-1]) )
		            a[i][j] = 'X';
		        }
		    }
		}
		String[] temp = new String[n];
		for(int i=0; i<n; i++) {
			temp[i]  = String.valueOf(a[i]);
		}
		return temp;
	}
}
