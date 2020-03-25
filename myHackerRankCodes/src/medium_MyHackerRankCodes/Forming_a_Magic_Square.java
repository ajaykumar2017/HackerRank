package medium_MyHackerRankCodes;

import java.util.Scanner;

public class Forming_a_Magic_Square {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//Taking input
		int[][] matrix = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		int result = formingMagicSquare(matrix);
		//Showing output
		System.out.println(result);
	}
	
	private static int formingMagicSquare(int[][] matrix) {
	    int[][][] d = {
	    	{{8,1,6},{3,5,7},{4,9,2}},
		    {{6,1,8},{7,5,3},{2,9,4}},
		    {{4,9,2},{3,5,7},{8,1,6}},
		    {{2,9,4},{7,5,3},{6,1,8}},
		    {{8,3,4},{1,5,9},{6,7,2}},
		    {{4,3,8},{9,5,1},{2,7,6}},
		    {{6,7,2},{1,5,9},{8,3,4}},
		    {{2,7,6},{9,5,1},{4,3,8}}};
		int c[] = new int[8];
		int min1;
		for(int k=0;k<8;k++)
		{
			c[k] = 0;
	      for(int i=0;i<3;i++)
		  {
		    for(int j=0;j<3;j++)
		    {
		    	if(matrix[i][j]!=d[k][i][j])
		    	{
		    		c[k]+=Math.abs(matrix[i][j]-d[k][i][j]);

		    	}
	 	    }
		  }
		}
		min1 = c[0];
		for(int i=1;i<8;i++){
			if(c[i]<min1)
		  	{
		  		min1=c[i];
			}
		}
	    return min1;
	}
}
