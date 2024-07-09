import java.util.*;
import java.io.*;
import java.lang.*;
public class Average_Waiting_Time {
    class Solution {
        public double averageWaitingTime(int[][] customers) {
            long curr_time = customers[0][0];
            long sum_waiting = 0;
            for(int[] nums : customers)
            {
                long arr = nums[0];
                long time = nums[1];
                if(curr_time<arr)
                {
                    curr_time = arr + time;
                }
                else
                {
                    curr_time = curr_time + time;
                }
                long wait = curr_time - arr;
                sum_waiting += wait;
            }
            double ans = sum_waiting/(double) customers.length;
            return ans;
        }
    }
}
