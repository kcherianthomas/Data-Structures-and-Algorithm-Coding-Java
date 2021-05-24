package com;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Character> map1 = new HashMap<>();
		Map<Character, Character> map2 = new HashMap<>();
		for (int i = 0; i < s.length(); ++i) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			if (map1.containsKey(ch1) && map2.containsKey(ch2)) {
				if (map1.get(ch1) != ch2 || map2.get(ch2) != ch1) {
					return false;
				}
			} else if ((map1.containsKey(ch1) && !map2.containsKey(ch2))
					|| (!map1.containsKey(ch1) && map2.containsKey(ch2))) {
				return false;
			} else {
				map1.put(ch1, ch2);
				map2.put(ch2, ch1);
			}
		}
		return true;
	}

}
