package easy_MyHackerRankCodes;

import java.util.*;

public class Flatland_Space_Stations {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// input
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			c[i] = scanner.nextInt();
		}
		
		// output
		int result = flatlandSpaceStations(n, c);
		System.out.println(result);
	}

	private static int flatlandSpaceStations(int nCities, int[] spaceStationArr) {
		/*
		 * The array has to be sorted. According to MSDN arrays that are sorted by using
		 * the Heapsort and Quicksort algorithms, in the worst case, this method is an
		 * O(n log n) operation, where n is the Length of array.
		 */
		Arrays.sort(spaceStationArr);
		// Set an initial max distance which can sensibly be the distance between City 0
		// and first space station
		int maxDistance = spaceStationArr[0];
		/*
		 * We are interested in the cities that are in the middle of two space stations
		 * as this city will be furthest for that set of two space stations
		 * 
		 * City : 0,1,2,3,5,6,7,8 SpaceStation : .,.,2,.,.,.,7,. In the example above, 5
		 * is in the middle of space station 2 and 7 and the distance to the closest one
		 * is 2 and can be calculated as (7-2)/2 = 2
		 */
		for (int i = 1; i < spaceStationArr.length; i++) {
			int distance = (spaceStationArr[i] - spaceStationArr[i - 1]) / 2;

			if (distance > maxDistance)
				maxDistance = distance;
		}
		// Check the distance of last spaceStation and last city.
		int lastSpaceStationDistance = nCities - 1 - spaceStationArr[spaceStationArr.length - 1];
		if (lastSpaceStationDistance > maxDistance) {
			maxDistance = lastSpaceStationDistance;
		}
		return maxDistance;
	}
}
