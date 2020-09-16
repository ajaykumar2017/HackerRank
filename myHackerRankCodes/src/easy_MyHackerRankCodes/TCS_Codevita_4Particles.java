package easy_MyHackerRankCodes;
import java.util.*;
public class TCS_Codevita_4Particles {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Input
		int h = sc.nextInt();
		sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.nextLine();
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int v3 = sc.nextInt();
		int v4 = sc.nextInt();
		char[] ch = new char[4];
		for(int i = 0; i < 4; i++) {
			ch[i] = sc.next().charAt(0);
		}
		
		//Output
		int[] result = fourParticles( h, a, b, c, d, v1, v2, v3, v4, ch);
		System.out.print(result[0] + " " + result[1]);

		
	}
	
	private static int[] fourParticles(int h, int a, int b, int c, int d, int v1, int v2, int v3, int v4, char[] ch) {
		int[] result = new int[2];
		List<Integer> maxArea = new ArrayList<Integer>();
		List<Integer> minArea = new ArrayList<Integer>();
		while(a!=h || a!=0 || b!=h || b!=0 || c!=h || c!=0 || d!=h || d!=0) {
			if(ch[0] == 'U') a+=v1;
			else a-=v1;
			if(ch[1] == 'U') b+=v2;
			else b-=v2;
			if(ch[2] == 'U') c+=v3;
			else c-=v3;
			if(ch[3] == 'U') d+=v4;
			else d-=v4;
		int areaABC = (int) ((int) 1/2 * h * Math.sqrt(h * h + Math.abs(a - b)));
		int areaADC = (int) ((int) 1/2 * h * Math.sqrt(h * h + Math.abs(a - d)));
		int mnArea = (int) (4 * Math.pow((areaABC + areaADC), 2));
		int mxArea = (int) (4 * Math.pow((areaABC + areaADC), 2));
		maxArea.add(mxArea);
		minArea.add(mnArea);
		}
		Collections.sort(maxArea, Collections.reverseOrder());
		Collections.sort(minArea, Collections.reverseOrder());
		result[0] = maxArea.get(0);
		result[1] = minArea.get(0);
		return result;
	}

}
