//Name: 704. Binary Search
//Difficulty: Easy
//Description: Given an array of integers nums which is sorted in ascending order, and an integer target,
    //write a function to search target in nums.
    //If target exists, then return its index. Otherwise, return -1.
//Runtime Complexity: O(logn)
//Space Complexity: O(1)
//Data Structure: Binary Search


class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}