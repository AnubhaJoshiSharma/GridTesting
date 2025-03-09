package javaAndSeleniumPrograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer>myset = Collections.synchronizedSet(new TreeSet<>());
		synchronized(myset) {
			myset.add(10);
			myset.add(20);
			myset.add(10);
			myset.add(30);
		}
		System.out.println(myset.size());
		
		Set<Integer> myset2 = new HashSet<>();
		myset2.add(10);
	}

}
