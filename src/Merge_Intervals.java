import java.util.Arrays;
import java.util.LinkedList;

class Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> merged = new LinkedList<>(); // List to store merged intervals

        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                // If the list is empty or the current interval does not overlap with the previous one,
                // add it to the merged list
                merged.add(interval);
            } else {
                // If the current interval overlaps with the previous one, update the end time of the
                // previous interval to the maximum of the two end times
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }

        // Convert the LinkedList to a 2D array and return
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        Merge_Intervals solution = new Merge_Intervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = solution.merge(intervals);

        // Print the merged intervals
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
