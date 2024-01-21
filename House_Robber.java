import java.io.*;
import java.lang.*;
import java.util.*;
public class House_Robber {
    class Solution {
        // DP memoization
        public int rob(int[] nums) {
            int n = nums.length;
            int dp[] = new int[n];
            Arrays.fill(dp , -1);
            return fun(nums , 0 , dp);
        }
        public static int fun(int[] nums , int index , int[] dp)
        {
            if(index >= nums.length)
            {
                return 0;
            }
            if(dp[index] != -1)
            {
                return dp[index];
            }
            int t = nums[index] + fun(nums , index + 2 , dp);
            int nt = fun(nums , index+1 , dp);
            return dp[index] = (int)Math.max(t , nt);
        }

        // Recursion
        // public int rob(int[] nums) {
        //     return fun(nums , 0);
        // }
        // public static int fun(int[] nums , int index)
        // {
        //     if(index >= nums.length)
        //     {
        //         return 0;
        //     }
        //     int t = nums[index] + fun(nums , index + 2);
        //     int nt = fun(nums , index+1);
        //     return (int)Math.max(t , nt);
        // }
    }
}
