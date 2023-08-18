//Name: 26. Remove Duplicates from Sorted Array
//Difficulty: Easy
//Description: Given an integer array nums sorted in non-decreasing order,
    //remove the duplicates in-place such that each unique element appears only once.
    //The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//Runtime Complexity: O(n)
//Space Complexity: O(1)

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[index + 1] = nums[i];
                index++;
                k++;
            }
        }
        return k;
    }
}