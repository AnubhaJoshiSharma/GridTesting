package javaAndSeleniumPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharsAndCountsOfString {
	
	public static void main(String[] args) {
		String str = "fgdfgethrhjfgjtyjfdgjjrh";
		Map<Character,Integer> mymap = new HashMap<>();
		for(char c:str.toCharArray()) {
			mymap.put(c, mymap.getOrDefault(c, 0)+1);
		}
		for(Entry<Character,Integer> entry:mymap.entrySet()) {
			System.out.println("Character "+entry.getKey()+ " appears "+ entry.getValue()+ " times.");
		}
		int max = 0;
		char maxchar=' ';
		for(Entry<Character,Integer> entry:mymap.entrySet()) {
			if(entry.getKey()>max) {
				max= entry.getValue();
				maxchar=entry.getKey();
			}	
		}
		System.out.println("Character "+ maxchar + " appears "+ max + " times and this is max.");
	}

}
