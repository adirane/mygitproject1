package javaTest;

import java.util.HashSet;
import java.util.Scanner;

public class longestsubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next(); 
		
		  HashSet<Character> set = new HashSet<Character>();

	        String longestOverAll = "";
	        String longestTillNow = "";

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);

	            if (set.contains(c)) {
	                longestTillNow = "";
	                set.clear();
	            }
	            longestTillNow += c;
	            set.add(c);
	            if (longestTillNow.length() > longestOverAll.length()) {
	                longestOverAll = longestTillNow;
	            }
	        }

	        
            
			System.out.println("The longest string is" +longestOverAll);

		}

}
