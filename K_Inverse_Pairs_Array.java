import java.util.*;
import java.io.*;
import java.lang.*;
public class K_Inverse_Pairs_Array {
    class Solution {
        // DP Memoization
        public int kInversePairs(int n, int k)
        {
            int[][] dp = new int[1001][1001];
            for(int[] rows : dp)
            {
                Arrays.fill(rows , -1);
            }
            return fun(n , k , dp);
        }

        public static int fun(int n , int k , int[][] dp)
        {
            int mod = 1000000007;
            if(n == 0)
            {
                return 0;
            }
            if(k == 0)
            {
                return 1;
            }
            if(dp[n][k] != -1)
            {
                return dp[n][k];
            }
            int count = 0;
            for(int i  = 0 ; i<=Math.min(k , n-1) ; i++)
            {
                count = (count + fun(n-1 , k-i , dp) % mod) % mod;
            }
            return dp[n][k] = count % mod;
        }


        // Recursion
        // public int kInversePairs(int n, int k)
        // {
        //     return fun(n , k);
        // }

        // public static int fun(int n , int k)
        // {
        //     if(n == 0)
        //     {
        //         return 0;
        //     }
        //     if(k == 0)
        //     {
        //         return 1;
        //     }
        //     int count = 0;
        //     for(int i  = 0 ; i<=Math.min(k , n-1) ; i++)
        //     {
        //         count = count + fun(n-1 , k-i);
        //     }
        //     return count;
        // }
    }
}
