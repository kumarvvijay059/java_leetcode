import java.lang.*;
import java.io.*;
import java.util.*;
public class Maximum_Total_Importance_of_Roads {
    class Solution {
        public long maximumImportance(int n, int[][] roads) {
            int[] hashing = new int[n];
            for(int[] arr : roads)
            {
                hashing[arr[0]]++;
                hashing[arr[1]]++;
            }
            Arrays.sort(hashing);
            long sum = 0;
            for(int i = 0 ; i<n ; i++)
            {
                sum = sum + (long)hashing[i]*(i+1);
            }
            return sum;
        }
    }
}
