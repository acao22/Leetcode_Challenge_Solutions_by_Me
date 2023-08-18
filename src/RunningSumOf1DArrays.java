//Name: 1480. Running Sum of 1D Array
//Difficulty: Easy
//Description: Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    //Return the running sum of nums.
//Runtime Complexity: O(n)
//Space Complexity: O(n)
//Data Structure: for loop

class RunningSumOf1DArrays {
    public int[] runningSum(int[] nums) {
        int tempSum = 0;
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            tempSum += nums[i];
            runningSum[i+1] = nums[i+1] + tempSum;
        }
        runningSum[nums.length - 1] = nums[nums.length - 1] + tempSum;
        return runningSum;
    }
}