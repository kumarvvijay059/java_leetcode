import java.io.*;
import java.lang.*;
import java.util.*;
public class Climbing_Stairs {
    class Solution {

        public int climbStairs(int n) {
            int[] dp = new int[n+1];
            Arrays.fill(dp , -1);
            return fun(n , dp);
        }

        public int fun(int n , int[] dp)
        {
            if(n == 0 || n == 1)
            {
                return 1;
            }
            if(dp[n] != -1)
            {
                return dp[n];
            }
            return dp[n] = fun(n-1 , dp) + fun(n-2 , dp);
        }

        //Recursion
        // public int climbStairs(int n) {
        //     return fun(n);
        // }

        // public int fun(int n)
        // {
        //     if(n == 0 || n == 1)
        //     {
        //         return 1;
        //     }
        //     return fun(n-1) + fun(n-2);
        // }
    }
}
