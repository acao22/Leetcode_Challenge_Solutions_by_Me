//Name: 58. Length of Last Word
//Difficulty: Easy
//Description: Given a string s consisting of words and spaces, return the length of the last word in the string.
// Runtime Complexity: O(n)
//Space Complexity: O(n)


class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                count = 0;
            } else {
                while (i >= 0 && s.charAt(i) != ' ') {
                    count++;
                    i--;
                }
                break;
            }
        }
        return count;
    }
}