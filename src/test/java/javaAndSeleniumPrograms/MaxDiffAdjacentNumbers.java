package javaAndSeleniumPrograms;

import java.util.Arrays;

public class MaxDiffAdjacentNumbers {
	public static void main(String[] args) {
		int [] a1 = {2,6,10,32,41};
		MaxDiffAdjacentNumbers.findMaxDiff(a1);
		MaxDiffAdjacentNumbers.maxDiff(a1);
	}
	public static void findMaxDiff(int []a) {
		int maxdiff=0;
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(maxdiff<a[j]-a[i])
				maxdiff = a[j]-a[i];
			}
		}
		System.out.println(maxdiff);
	}
	
	public static void maxDiff(int [] a) {
		int diff=0;
		for(int i=0;i<a.length-1;i++) {
			if(diff< a[i+1]-a[i]) {
				diff = a[i+1]-a[i];
			//	System.out.println(diff);
			}
		}
		System.out.println("DIFF "+ diff);
	}

}
