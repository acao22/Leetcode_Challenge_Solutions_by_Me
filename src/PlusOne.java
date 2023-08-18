//Name: 1. Two Sum
//Difficulty: Easy
//Description: You are given a large integer represented as an integer array digits,
    //where each digits[i] is the ith digit of the integer.
    //The digits are ordered from most significant to least significant in left-to-right order.
    //The large integer does not contain any leading 0's.
    //Increment the large integer by one and return the resulting array of digits.
//Runtime Complexity: O(n)
//Space Complexity: O(n)

class PlusOne {
    public int[] plusOne(int[] digits) {
        int end = digits.length - 1;
        digits[end] += 1;
        for (int i = end; i > 0; i--)   {
            if (digits[i] >= 10) {
                digits[i] = 0;
                digits[i-1]+=1;
            }
        }
        if (digits[0] >= 10) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            newArray[1] = 0;
            System.arraycopy(digits, 1, newArray, 2, digits.length - 1);
            return newArray;
        } else {
            return digits;
        }
    }
}