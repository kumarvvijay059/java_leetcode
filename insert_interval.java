import java.util.*;
import java.lang.*;
import java.io.*;
public class insert_interval
{
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            List<int[]> al = new ArrayList();
            for(int[] in: intervals)
            {
                if(in[1]<newInterval[0])
                {
                    al.add(in);
                }
                else if(in[0]>newInterval[1])
                {
                    al.add(newInterval);
                    newInterval = in;
                }
                else
                {
                    newInterval[0] = Math.min(newInterval[0] , in[0]);
                    newInterval[1] = Math.max(newInterval[1] , in[1]);
                }
            }
            al.add(newInterval);
            return al.toArray(new int[al.size()][]);
        }
    }
}
