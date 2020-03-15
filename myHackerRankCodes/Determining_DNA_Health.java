package myHackerRankCodes;

import java.util.*;

public class Determining_DNA_Health {
	public static void main(String[] args) {
		// Taking input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  // First Line--> total number of genes
		String genes = sc.nextLine();  // Second Line--> the elements of genes
		String[] genElements = genes.split(" ");
		String health = sc.nextLine();
		String[] healthElementsString = health.split(" "); // Third Line--> the elements of health
		int[] healthElements = new int[healthElementsString.length];
		for (int i = 0; i < healthElementsString.length; i++) {
			healthElements[i] = Integer.parseInt(healthElementsString[i]);
		}
		int s = sc.nextInt(); //Fourth Line--> denoting the number of strands of DNA to process
		/**
		 * Each of the  subsequent lines describes a DNA strand in the form start end d,
		 *  denoting that the healthy genes for DNA
		 */
		int[] start = new int[s];
		int[] end = new int[s];
		String[] d = new String[s];
		for(int i=0; i<s; i++) {
			start[i] = sc.nextInt();
			end[i] = sc.nextInt();
			d[i] = sc.next();
		}
		//Logic for Solving question
		int[] totalHealthvalues = new int[s];
		for(int i=0; i<s; i++) {
			totalHealthvalues[i] = 0;
			//Taking the DNA(String)
			for(int k=0; k<d[i].length(); k++) {
				int endIndex = k+1;
				while(endIndex<d[i].length()) {
					for( int j=start[i]; j<=end[i]; j++) {
						if(d[i].substring(k, endIndex).contains(genElements[j])) {
							totalHealthvalues[i] = totalHealthvalues[i] + healthElements[j];
						}
						
					}
					
				}
				//Taking indices of genes from start to end
				
			}
		}
		
		
		// Showing output
		/**
		 * Print two space-separated integers describing the respective total health of
		 * the unhealthiest and the healthiest strands of DNA
		 */

	}
	
	private static 
}
