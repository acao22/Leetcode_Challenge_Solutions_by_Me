//Name: 242. Valid Anagram
//Difficulty: Easy
//Description: Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//Runtime Complexity: O(n)
//Space Complexity: O(n)
//Data Structure: HashMaps & for loops


import java.util.HashMap;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) {
                int sValue = sMap.get(s.charAt(i));
                sValue++;
                sMap.put(s.charAt(i), sValue);
            } else {
                sMap.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (sMap.containsKey(t.charAt(i))) {
                int tValue = sMap.get(t.charAt(i));
                tValue--;
                sMap.put(t.charAt(i), tValue);
            } else {
                return false;
            }
        }

        for(Integer value: sMap.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}