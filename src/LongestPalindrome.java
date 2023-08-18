//Name: 409. Longest Palindrome
//Difficulty: Easy
//Description: Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
    //letters are case-sensitive
//Runtime Complexity: O(n)
//Space Complexity: O(n)
//Data Structure: HashMap

import java.util.HashMap;

class LongestPalindrome {
    public int longestPalindrome(String s) {
        int count = 0;
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (char letter : s.toCharArray()){
            sMap.put(letter, sMap.getOrDefault(letter, 0) + 1);
            if (sMap.get(letter) % 2 == 1){
                count++;
            }
            else{
                count--;
            }
        }
        if (count > 1){
            return s.length() - count + 1;
        }
        return s.length();
    }

}