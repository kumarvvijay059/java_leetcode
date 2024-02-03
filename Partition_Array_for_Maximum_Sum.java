import java.util.*;
import java.lang.*;
import java.io.*;
public class Partition_Array_for_Maximum_Sum {
    class Solution {
        public int maxSumAfterPartitioning(int[] arr, int k) {
            int[] dp = new int[arr.length];
            Arrays.fill(dp , -1);
            return fun(0, arr , k , dp);
        }

        public static int fun(int i , int[] arr , int k , int[] dp)
        {
            int n = arr.length;
            if(i == n)
            {
                return 0;
            }
            if(dp[i] != -1)
            {
                return dp[i];
            }
            int len = 0;
            int maxi = Integer.MIN_VALUE;
            int maxa = Integer.MIN_VALUE;
            for(int j = i ; j<Math.min(n , i+k) ; j++)
            {
                len++;
                maxi = Math.max(maxi , arr[j]);
                int sum = len * maxi + fun(j+1 , arr , k , dp);
                maxa = Math.max(maxa , sum);
            }
            return dp[i] = maxa;
        }
    }
}
