package myHackerRankCodes;

import java.util.*;


public class Determining_DNA_Health {
	private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	//First Line-->Taking input total number of genes
    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //Second Line-->space-separated strings describing the respective values of genes      
        String[] genesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] genes = new String[n];
        for (int i = 0; i < n; i++) {
            String genesItem = genesItems[i];
            genes[i] = genesItem;
        }
        //Third Line-->space-separated integers describing the respective values of health
        String[] healthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] healthElements = new int[n];
        for (int i = 0; i < n; i++) {
            int healthItem = Integer.parseInt(healthItems[i]);
            healthElements[i] = healthItem;
        }
        //Fourth Line-->denoting the number of strands of DNA to process.
        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //Each of the s subsequent lines describes a DNA strand in the form start end d,
        //denoting that the healthy genes for DNA strand d are  g.start.....g.end and their respective 
        //correlated health values are h.start ..... h.end
        int[] start = new int[s];
        int[] end = new int[s];
        String[] d = new String[s];
        for (int i = 0; i < s; i++) {
            start[i] = scanner.nextInt();
			end[i] = scanner.nextInt();
			d[i] = scanner.next();
        }
        //Showing output
        int[] result = determiningDNAHealth(genes, healthElements, s, start, end, d);
		Arrays.sort(result);
		System.out.println(result[0]+" "+result[result.length-1]);
		scanner.close();
    }	
    
    private static int[] determiningDNAHealth(String[] genElements, int[] healthElements,
    											int s, int[] start, int[] end, String[] d) {
        int[] totalHealthValues = new int[s];
        for(int i=0; i<s; i++) {
            totalHealthValues[i] = 0;
            for(int j=0; j<d[i].length(); j++) {
                for(int k=j+1; k<=d[i].length(); k++) {
                    String sub = d[i].substring(j, k);
                    boolean match = false;
                    for(int p=start[i]; p<=end[i]; p++) {
                        if(sub.equals(genElements[p])) {
                            totalHealthValues[i] = totalHealthValues[i] + healthElements[p];
                            match = true;
                        }
                    }
                    if(match)
                        break;
                }
            }
        }
        return totalHealthValues;
    }

}
