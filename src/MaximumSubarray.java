//Name: 53. Maxmimum Subarray
//Difficulty: Medium
//Description: Given an integer array nums, find the
    //subarray with the largest sum, and return its sum.
//Runtime Complexity: O(n)
//Space Complexity: O(1)
//Data Structure: for loop


class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return maxSum;
    }
}