//Name: 67. Add Binary
//Difficulty: Easy
//Description: Given two binary strings a and b, return their sum as a binary string.
//Runtime Complexity: O(n)
//Space Complexity: O(1)
//Data Structure: while loop with carry/positions & stringbuilder


class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int carry = 0;
        int posA = a.length() - 1;
        int posB = b.length() - 1;
        while (posA >= 0 || posB >= 0 || carry != 0) {
            if (posA >= 0) {
                carry += a.charAt(posA--) - '0';
            }
            if (posB >= 0) {
                carry += b.charAt(posB--) - '0';
            }
            stringBuilder.append(carry % 2);
            carry = carry / 2;
        }
        return stringBuilder.reverse().toString();
    }
}