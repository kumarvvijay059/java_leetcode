import java.util.*;
import java.io.*;
import java.lang.*;
public class Perfect_Squares {
    class Solution {
        public int numSquares(int n) {
            int[] dp = new int[n+1];
            dp[0] = 0;
            for(int i = 1 ; i<=n ; i++)
            {
                int min = Integer.MAX_VALUE;
                for(int j = 1 ; i>=j*j ; j++)
                {
                    min = Math.min(min , 1 + dp[i-j*j]);
                }
                dp[i] = min;
            }
            return dp[n];
        }
    }
}
