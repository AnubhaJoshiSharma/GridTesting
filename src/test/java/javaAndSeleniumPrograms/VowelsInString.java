package javaAndSeleniumPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VowelsInString {
	public static void main(String[] args) {
		String str = "dfioeiroejpipjgolnih";
		Map<Character,Integer>mymap = new HashMap<>();
		for(char c: str.toLowerCase().toCharArray()) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				mymap.put(c, mymap.getOrDefault(c, 0)+1);
			}
		}
		for(Entry<Character,Integer>entry:mymap.entrySet()) {
			System.out.println("vowel "+ entry.getKey()+ " appears "+ entry.getValue()+ " times.");
		}
	}

}
