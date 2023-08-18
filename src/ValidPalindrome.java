//Name: 125. Valid Palindrome
//Difficulty: Easy
//Description: Given a string s, return true if it is a palindrome, or false otherwise.
//Runtime Complexity: O(n)
//Space Complexity: O(1)
//Data Structure: while loop

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        String sl = s.toLowerCase();
        while (start < end)  {
            if (!Character.isLetterOrDigit(sl.charAt(start))) {
                start++;
            }
            else if (!Character.isLetterOrDigit(sl.charAt(end))) {
                end--;
            }
            else {
                if (sl.charAt(start) == (sl.charAt(end))) {
                    start++;
                    end--;
                } else {
                    return false;
                }
            }
        }
        return true;

    }
}