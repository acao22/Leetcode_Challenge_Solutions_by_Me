//Name: 9. Palindrome Number
//Difficulty: Easy
//Description: Given an integer x, return true if x is a
    //palindrome, and false otherwise.
//Runtime Complexity: O(n)
//Space Complexity: O(n)

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String reverse = "";
        String xString = Integer.toString(x);
        int digit = x % 10;
        while (x != 0) {
            reverse += digit;
            x = x / 10;
            digit = x % 10;
        }
        return reverse.equals(xString);
    }
}