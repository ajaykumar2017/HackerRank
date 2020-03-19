package easy_MyHackerRankCodes;
import java.util.*;
public class Cut_The_Sticks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int[] result = cutTheSticks(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
        }
	}
	
	/*
	 * static List<Integer> distinctElementsOfTheArray(int[] arr) { int
	 * length=arr.length; List<Integer> distinct=new ArrayList<>(); for (int i = 0;
	 * i < length; i++) { // Check if the picked element // is already printed int
	 * j; for (j = 0; j < i; j++) if (arr[i] == arr[j]) break;
	 * 
	 * // If not printed earlier, // then print it if (i == j) distinct.add(arr[i]);
	 * } return distinct; }
	 */
	
//    int count = 0;
//    vector<int> result;
//    sort(arr.begin(),arr.end());
//    for(int i = 0; i<arr.size(); i++){
//        if(arr[i]!=0){
//            for(int j = i+1; j<arr.size(); j++){
//                arr[j] = (arr[j] - arr[i]);
//                count++;
//            }
//            result.push_back(count+1);
//            count = 0;
//        }
//    }
//    return result;
	
	
	static int[] cutTheSticks(int[] arr) {
		//Step 1: sorting array arr
		Arrays.sort(arr);
		int length=arr.length;
		//Step 2: Finding distinct elements of the array arr
		/*
		 * int length=arr.length; List<Integer> distinct=new ArrayList<>(); for(int i=0;
		 * i<length; i++) { for(int j=0; j<length; j++) { if(arr[i]==arr[j]&&i==j)
		 * distinct.add(arr[j]); } }
		 */
		
		
		
		//Step 3
		List<Integer> result=new ArrayList<>(); //Step 5
		int count=0;
		for(int i=0; i<length; i++) {
			if(arr[i]!=0) {
				for(int j=i+1; j<length; j++) {
					//Step 4
						arr[j]=(arr[j]-arr[i]);
						count++;
				}
				result.add(count+1);
				count=0;
			}
		}
		//Step 7
		int[] result1=new int[result.size()];
		for(int i=0; i<result.size(); i++) {
			result1[i]=result.get(i);
		}
		return result1;
	
	}
}
