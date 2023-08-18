//Name: 217. Contains Duplicate
//Difficulty: Easy
//Description: Given an integer array nums, return true if any value appears at least twice in the array,
    //and return false if every element is distinct.
//Runtime Complexity: O(n)
//Space Complexity: O(n)
//Data Structure: HashSet

import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsSet.contains(nums[i])) {
                return true;
            } else {
                numsSet.add(nums[i]);
            }
        }
        return false;
    }
}