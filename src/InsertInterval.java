//Name: 57. Insert Interval
//Difficulty: Medium
//Description: You are given an array of non-overlapping intervals intervals where
    // intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti.
    // You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
    //Insert newInterval into intervals such that intervals is still sorted in ascending order by starti
    //and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
//Runtime Complexity: O(n)
//Space Complexity: O(n)
//Data Structure: ArrayList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] finalInterval = new int[intervals.length + 1][];
        int count = 0;
        for (int[] i : intervals) {
            finalInterval[count++] = i;
        }
        finalInterval[intervals.length] = newInterval;
        Arrays.sort(finalInterval, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        for (int[] j : finalInterval) {
            if (list.size() == 0) {
                list.add(j);
            } else {
                int[] prevJ = list.get(list.size() - 1);
                if (j[0] <= prevJ[1]) {
                    prevJ[1] = Math.max(prevJ[1], j[1]);
                }
                else list.add(j);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}