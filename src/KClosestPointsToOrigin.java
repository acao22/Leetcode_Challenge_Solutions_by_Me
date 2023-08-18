//Name: 973. K Closest POints to Origin
//Difficulty: Medium
//Description: Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane
    //and an integer k, return the k closest points to the origin (0, 0).
//Runtime Complexity: O(n) but O(n^2) worst case
//Space Complexity: O(n)
//Data Structure: quicksort algorithm w/ partition helper


import java.util.Arrays;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        //quicksort algorithm
        int left = 0;
        int right = points.length - 1;
        while (left <= right) {
            int mid = partition(points, left, right);
            if (mid == k) {
                break;
            }
            if (mid < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return Arrays.copyOfRange(points, 0, k);
    }

    private int partition(int[][] p, int left, int right) {
        int[] pivot = p[left];
        while (left < right) {
            while (left < right && distanceOf(p[right], pivot) >= 0) {
                right = right - 1;
            }
            p[left] = p[right];
            while (left < right && distanceOf(p[left], pivot) <= 0) {
                left = left + 1;
            }
            p[right] = p[left];
        }
        p[left] = pivot;
        return left;
    }

    private int distanceOf(int[] point1, int[] point2) {
        return (point1[0]*point1[0]) + (point1[1]*point1[1]) - (point2[0]*point2[0]) - (point2[1]*point2[1]);
    }
}