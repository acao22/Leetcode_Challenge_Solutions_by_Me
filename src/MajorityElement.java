//Name: 1. Two Sum
//Difficulty: Easy
//Description:
//Runtime Complexity: O(n)
//Space Complexity: O(n)
//Data Structure: recursive divide & conquer / variation of Boyer-Moore Voting Algorithm


import java.util.ArrayList;

class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length % 2 != 0) {
            int count = 0;
            int oddElement = nums[nums.length - 1];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == oddElement) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return oddElement;
            }
        }
        ArrayList<Integer> newNums = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] == nums[i+1]) {
                newNums.add(nums[i]);
            }
        }
        int[] finalNums = newNums.stream().mapToInt(i -> i).toArray();
        return majorityElement(finalNums);
    }
}