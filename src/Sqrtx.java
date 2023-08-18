//Name: 69. Sqrt(x)
//Difficulty: Easy
//Description: Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
    // The returned integer should be non-negative as well.
    //You must not use any built-in exponent function or operator.
//Runtime Complexity: O(n)
//Space Complexity: O(1)
//Data Structure: for loop

class Sqrtx {
    public int mySqrt(int x) {
        int j = 0;
        if (x == 0) {
            return 0;
        }
        for (int i = 1; i <= x / i; i++) {
            if (x / i == i) {
                return i;
            }
            j = i;
        }
        return j;
    }
}