package easy_MyHackerRankCodes;

import java.util.*;

public class ACM_ICPC_Team {

	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking the input from the user
		int n = scanner.nextInt(); // represents the number of attendees
		int m = scanner.nextInt(); // represents the number of topics
		String[] topics = new String[n];
		for (int i = 0; i < n; i++) {
			topics[i] = scanner.next();
		}

		// Showing the output
		int[] result = acmTeam(topics, m);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	/**
	 * Complete the acmTeam function in the editor below. It should return an
	 * integer array with two elements: the maximum number of topics any team can
	 * know and the number of teams that can be formed that know that maximum number
	 * of topics.
	 * 
	 * acmTeam has the following parameter(s):
	 * 
	 * topic: a string of binary digits
	 */

	static int[] acmTeam(String[] topics, int m) {
		int[] result = new int[2];
		int n = topics.length;
		List<Integer> maxTopics = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int count = 0;
				for (int k = 0; k < m; k++) {
					if(topics[i].charAt(k) == '1' || topics[j].charAt(k) == '1') {
						count++;
					}
				}
				maxTopics.add(count);
			}
		}
		Collections.sort(maxTopics, Collections.reverseOrder());
		result[0] = maxTopics.get(0);
		for(int i = 0; i < maxTopics.size(); i++) {
			if(maxTopics.get(i) == result[0]) {
				result[1]++;
			}
		}
		return result;
	}

}
