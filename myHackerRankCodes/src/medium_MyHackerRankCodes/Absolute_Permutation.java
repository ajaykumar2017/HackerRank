package medium_MyHackerRankCodes;

import java.util.*;

public class Absolute_Permutation {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Taking the input from the user
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < t; i++) {
			String[] nk = scanner.nextLine().split(" ");
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);

			int[] result = absolutePermutation(n, k);
			System.out.println(Arrays.toString(result));
		}
	}

	private static int[] absolutePermutation(int n, int k) {
		if (k == 0) {
			return range(1, n);
		} else if ((n/k) % 2 != 0) {
			int[] result = new int[1];
			result[0] = -1;
			return result;
		} else {
			boolean add = true;
			List<Integer> perm = new ArrayList<Integer>();
			for (int i = 1; i <= n; i++) {
				if (add)
					perm.add(i + k);
				else
					perm.add(i - k);

				if (i % k == 0) {
					if (add)
						add = false;
					else
						add = true;
				}
			}
			int[] arr = new int[perm.size()];
			for (int i = 0; i < perm.size(); i++)
				arr[i] = perm.get(i);
			return arr;
		}

	}

	private static int[] range(int start, int end) {
		int[] range = new int[end];
		for (int i = start - 1; i < end; i++) {
			range[i] = i + 1;
		}
		return range;
	}
}
