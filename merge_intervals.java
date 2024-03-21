import java.util.*;
import java.lang.*;
import java.io.*;
public class merge_intervals {
    class Solution {
        public int[][] merge(int[][] intervals) {
            List<int[]> al = new ArrayList<>();
            if(intervals.length == 0 || intervals == null)
            {
                return al.toArray(new int[0][]);
            }
            Arrays.sort(intervals,(a,b)->a[0] - b[0]);
            int start = intervals[0][0];
            int end = intervals[0][1];
            for(int[] i : intervals)
            {
                if(i[0] <= end)
                {
                    end = Math.max(end , i[1]);
                }
                else
                {
                    al.add(new int[]{start , end});
                    start = i[0];
                    end = i[1];
                }
            }
            al.add(new int[]{start , end});
            return al.toArray(new int[0][]);
        }
    }
}
