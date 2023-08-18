//Name: 28. Find the Index of the First Occurrence in a String
//Difficulty: Easy
//Description: Given two strings needle and haystack,
    //return the index of the first occurrence of needle in haystack,
    //or -1 if needle is not part of haystack.
// Runtime Complexity: O(n^2)
//Space Complexity: O(n^2)

class FindTheIndexOfTheFirstOccurenceInAString {
    public int strStr(String haystack, String needle) {
        int temp = 0;
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            temp = i;
            boolean match = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(temp) == needle.charAt(j)) {
                    temp++;
                }
                else {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;
            }
        }
        return -1;
    }
}