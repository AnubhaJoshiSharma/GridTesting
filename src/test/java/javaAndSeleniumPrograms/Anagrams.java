package javaAndSeleniumPrograms;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		String one = "ntpc";
		String two = "cntc";
		if(one.length()!=two.length()) {
			System.out.println("Not anagrams");
			return;
		}
		else {
			char [] a = one.toLowerCase().toCharArray();
			char [] b = two.toLowerCase().toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.equals(a, b)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not anagrams");
			}
			
		}
	}

}
