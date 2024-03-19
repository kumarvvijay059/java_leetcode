import java.util.*;
import java.io.*;
import java.lang.*;
public class Task_Scheduler {
    class Solution {
        public int leastInterval(char[] tasks, int n) {
            int[] hashing = new int[26];
            for(char c : tasks)
            {
                hashing[c - 'A']++;
            }
            Arrays.sort(hashing);
            int maxFreq = hashing[25];
            int idle = (maxFreq-1) * n;
            for (int i = 24 ; i >= 0 ; i--)
            {
                idle = idle - Math.min((maxFreq-1), hashing[i]);
            }
            if(idle<0)
            {
                return tasks.length;
            }
            return tasks.length + idle;
        }
    }
}
