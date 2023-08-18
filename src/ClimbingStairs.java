//Name: 70. Climbing Stairs
//Difficulty: Easy
//Description: You are climbing a staircase. It takes n steps to reach the top.
    //Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//Runtime Complexity: O(n)
//Space Complexity: O(1)
//Data Structure: for loop logic

class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int x = 1;
        int y = 2;
        for (int i = 2; i < n; i++) {
            int temp = x;
            x = y;
            y = temp + y;
        }
        return y;
    }
}