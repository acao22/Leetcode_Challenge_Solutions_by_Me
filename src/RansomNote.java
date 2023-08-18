//Name: 383. Ransom Note
//Difficulty: Easy
//Description: Given two strings ransomNote and magazine,
    //return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
    //Each letter in magazine can only be used once in ransomNote.
//Runtime Complexity: O(n)
//Space Complexity: O(n)
//Data Structure: Hashmap & loops

import java.util.HashMap;

class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            Character curr = magazine.charAt(i);
            if (!magazineMap.containsKey(curr)) {
                magazineMap.put(curr, 1);
            } else {
                magazineMap.put(curr, magazineMap.get(curr) + 1);
            }

        }

        for (int i = 0; i < ransomNote.length(); i++) {
            Character curr = ransomNote.charAt(i);
            if (magazineMap.containsKey(curr) && magazineMap.get(curr) > 0) {
                magazineMap.put(curr, magazineMap.get(curr) - 1);
            } else {
                return false;
            }

        }
        return true;
    }
}