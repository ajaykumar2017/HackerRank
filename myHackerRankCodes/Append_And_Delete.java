package myHackerRankCodes;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Append_And_Delete {

    // Complete the appendAndDelete function below.
static String appendAndDelete (String s, String t, int k) {
    String result = null;
    int temp = 0;
    if (s.equals(t)) {
        result="Yes";
    }
    else {
        StringBuilder s_sb = new StringBuilder();
        s_sb.append(s);
        StringBuilder t_sb = new StringBuilder();
        t_sb.append(t);
        //Case 1: When length of s greater than 1
    	if(s_sb.length()>1) {
    		//Case (i): When First Characters of s and t are same
    		if(s_sb.charAt(0) == t_sb.charAt(0)) {
                int nextAddFrom = 0;
                boolean match = false;
                boolean isWholeString = true;
                while(temp<=k && !s_sb.equals(t_sb) && !match) {
                	if(isWholeString) {
                		isWholeString = false;
                	}
                	else if(!isWholeString) {
                        s_sb = deleteLastCharacter(s_sb);
                        temp++;
                	}
                	if(s_sb.length()>0) {
                        for(int i=1; i<=t_sb.length(); i++) {
                            StringBuilder sub = new StringBuilder();
                            sub.append(t_sb.substring(0, i));
                            
                            if(s_sb.toString().equals(sub.toString())) {
                                nextAddFrom = i;
                                match = true;
                                break;
                            }
                        }
                        if(match) {
                            for(int j=nextAddFrom; j<t_sb.length(); j++) {
                                char CharToBeAdded = t_sb.charAt(j);
                                s_sb = AddLastCharacter(s_sb, CharToBeAdded);
                                temp++;
                            }
                        }
                	} else {
                		   for(int j=0; j<t_sb.length(); j++) {
                               char CharToBeAdded = t_sb.charAt(j);
                               s_sb = AddLastCharacter(s_sb, CharToBeAdded);
                               temp++;
                           }
                	}
                }
    		} 
    		//Case (ii): When First Characters of s and t are not same
    		else {
    			/**
    			 * if first characters of both the strings are not same then no substring are same,
    			 * So we have to delete all the characters of s and append all the characters of t,
    			 * Then total numbers of operations will be length of s+ length of t.
    			 */
    			temp = s_sb.length() + t_sb.length();
    			//Now s is converted to t so we can write t to s directly
    			s_sb = t_sb;
    		}
        
    	} 
    	//Case 2: When length of s less than 1
    	else {
    		//Case (i): When first character of s and t are same
    		if(s_sb.toString().equals(String.valueOf(t_sb.charAt(0)))) {
      		  for(int j=0; j<t_sb.length(); j++) {
                    char CharToBeAdded = t_sb.charAt(j);
                    s_sb = AddLastCharacter(s_sb, CharToBeAdded);
                    temp++;
                }
    		} 
    		//Case (ii): When first character of s and t are not same
    		else {
    			/**
    			 * When first character of s and t are not same then total number of operations will be:
    			 * 1 delete operation of s + append operation of t(which is as the length of t)
    			 */
    			temp = t_sb.length()+1;
    			//Now s is converted to t so we can write t to s directly
    			s_sb = t_sb;
    		}
    	}
		if(temp<=k && s_sb.toString().equals(t_sb.toString())) {
            result = "Yes";
        }
        else {
            result = "No";
        }
    }
    return result;
}

static StringBuilder deleteLastCharacter (StringBuilder sb) {
    sb.delete(sb.length()-1, sb.length());
    return sb;
}

static StringBuilder AddLastCharacter (StringBuilder sb, char lastCharacter) {
    sb.append(String.valueOf(lastCharacter));
    return sb;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        System.out.println(result);

        scanner.close();
    }
}
