package apple;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubstringWithKUnique {
	public static void main(String[] args) {
		String str = "aabbcc";
		int k=2;
		getKUniqueCharSubstring(str,k);
	}
	
	private static boolean isValid(int[] count,int k) {
		int val = 0; 
        for (int i = 0; i < 26; i++) { 
            if (count[i] > 0) { 
                val++; 
            } 
        } 
  
        // Return true if k is greater than or equal to val 
        return (k >= val); 
	}
	
	private static void getKUniqueCharSubstring(String str,int k) {
		int[] count=new int[26];
		
		int u=0;
		int n=str.length();
		for (int i = 0; i < n; i++) { 
            if (count[str.charAt(i) - 'a'] == 0) { 
                u++; 
            } 
            count[str.charAt(i) - 'a']++; 
        } 
  
        // If there are not enough unique characters, show 
        // an error message. 
        if (u < k) { 
            System.out.print("Not enough unique characters"); 
            return; 
        } 
  
		
		int curr_start=0;
		int curr_end=0;
		
		int max=1;
		int window_start=0;
		
		Arrays.fill(count, 0);
		count[str.charAt(0)-'a']++;
		
		for(int i=1;i<str.length();i++) {
			count[str.charAt(i)-'a']++;
			curr_end++;
				while(!isValid(count,k)) {
					count[str.charAt(curr_start)-'a']--;
					curr_start++;
				}
				
				if(curr_end-curr_start+1>max) {
					max = curr_end-curr_start+1;
					window_start = curr_start;
				}
		}
		
		System.out.println("string is="+str.substring(window_start,max)+"= with size"+max);
	}
}
