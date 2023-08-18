//Name: 1. Two Sum
//Difficulty: Easy
//Description: Given an array of integers nums and an integer target,
    //return indices of the two numbers such that they add up to target.
//Runtime Complexity: O(n) - linear time complexity
//Space Complexity: O(n) - linear space complexity


import java.util.HashMap;

class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                return new int[] {i, numsMap.get(target - nums[i])};
            }
            else {
                numsMap.put(nums[i], i);
            }
        }
        return null;
    }
}