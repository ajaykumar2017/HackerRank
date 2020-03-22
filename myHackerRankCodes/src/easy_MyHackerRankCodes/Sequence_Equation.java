package easy_MyHackerRankCodes;
import java.util.*;
public class Sequence_Equation {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//Taking input
		int n = scanner.nextInt(); //the number of elements in the sequence
		int[] p = new int[n];
		for(int i=0; i<n; i++) {
			p[i] = scanner.nextInt();
		}
		int[] result = permutationEquation(p);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	private static int[] permutationEquation(int[] p) {
		int[] sequence = new int[p.length];
		//We should take from 1 to x so we take from 1 to length of the array
		for(int i=1; i<=p.length; i++) {
			//Now it should be checked for which p(p(y))==x
			for(int j=0; j<p.length; j++) {
				//Subtract 1 as we are iterating from 0 to (p.length-1)
				if(p[p[j]-1]==i) { 
					//Subtract 1 as we are iterating from 1 to p.length
					//Now assign j+1 to sequence array index begins from 1 according to the question
					sequence[i-1] = j+1;
				}
			}
		}
		return sequence;
    }
}
