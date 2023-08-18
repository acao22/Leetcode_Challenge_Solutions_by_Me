//Name: 88. Merge Sorted Array
//Difficulty: Easy
//Description: You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
    //and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    //Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//Runtime Complexity: O(n)
//Space Complexity: O(1)
//Data Structure: while loop


class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = nums1.length - 1;
        int end1 = m - 1;
        int end2 = n - 1;
        while (end2 >= 0) {
            if (end1 >= 0 && nums1[end1] > nums2[end2]) {
                nums1[total] = nums1[end1];
                total--;
                end1--;
            } else {
                nums1[total] = nums2[end2];
                total--;
                end2--;
            }

        }
    }
}

