import java.util.*;
import java.io.*;
import java.lang.*;
public class Meeting_Rooms_III {
    class Solution {
        public int mostBooked(int n, int[][] meetings) {
            Arrays.sort(meetings , (a , b) -> a[0] - b[0]);
            int[] roomcount = new int[n];
            long[] endtime = new long[n];
            for(int i = 0 ; i<meetings.length ; i++)
            {
                int st = meetings[i][0];
                int ed = meetings[i][1];
                boolean a = false;
                int min_ind = -1;
                long val = Long.MAX_VALUE;
                for(int j = 0 ; j<n ; j++)
                {
                    if(endtime[j]<val)
                    {
                        val = endtime[j];
                        min_ind = j;
                    }
                    if(endtime[j] <= st)
                    {
                        a = true;
                        roomcount[j]++;
                        endtime[j] = ed;
                        break;
                    }
                }
                if(!a)
                {
                    roomcount[min_ind]++;
                    endtime[min_ind] += (ed-st);
                }
            }
            int max = -1 , ind = -1;
            for(int i = 0 ; i<n ; i++)
            {
                if(roomcount[i]>max)
                {
                    max = roomcount[i];
                    ind = i;
                }
            }
            return ind;
        }
    }
}
