//Name: 15. 3Sum
//Difficulty: Medium
//Description: Given an integer array nums, return all the triplets [nums[i], nums[j],
    //nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    //Notice that the solution set must not contain duplicate triplets.
//Runtime Complexity: O(n^2)
//Space Complexity: O(1)
//Data Structure: double foor loop with sldiing window

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        //sort the array first
        Arrays.sort(nums);
        //choose a fixed number at every iteration
        for (int i = 0; i < nums.length - 2; i++) {
            //if number is repeated, don't go thru the loop and just continue
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            //make a low pointer
            int low = i + 1;
            //make a high pointer
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                //if the sum is +, then decrement high
                //if the sum is -, then increment low
                if (sum > 0) {
                    high--;
                }  else if (sum < 0) {
                    low++;
                } else {
                    //else since sum is 0, add to answer array
                    answer.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    //go to the last occurences of num[low] and num[high] to avoid duplicates
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }
                    while (high > low && nums[high] == nums[high + 1]) {
                        high--;
                    }
                }
            }
        }
        return answer;
    }
}