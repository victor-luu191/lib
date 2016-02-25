package myUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Misc {

	public static Set<String> digits() {
		String[] ds = {"0","1","2","3","4","5","6","7","8","9"};
		return new HashSet<String>(Arrays.asList(ds));
	}

	public static Set<String> letters() {
	
			Set<String> letterSet = new HashSet<String>();
			String lowers = "abcdefghijklmnopqrstuvwxyz";
			// another way if do not want to type all letters
	//		for (char c = 'a'; c <= 'z'; c++) {
	//		    lowers[c - 'a'] = c;
	//		}
			
			String uppers = lowers.toUpperCase();
			String alphabet = lowers + uppers;
			for (int i = 0; i < alphabet.length(); i++) {
				letterSet.add(alphabet.substring(i, i+1));
			}
			return letterSet;
		}

}
