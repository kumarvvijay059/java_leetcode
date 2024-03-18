import java.util.*;
import java.io.*;
import java.lang.*;
public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
            long arrow = Long.MIN_VALUE;
            long ans = 0;
            for(int[] arr : points)
            {
                if(arrow<arr[0])
                {
                    arrow = arr[1];
                    ans++;
                }
            }
            return (int)ans;
        }
    }
}
