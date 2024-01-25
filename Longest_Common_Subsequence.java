import java.io.*;
import java.util.*;
import java.lang.*;
public class Longest_Common_Subsequence {
    class Solution {

        public int longestCommonSubsequence(String text1, String text2)
        {
            int n1 , n2;
            n1 = text1.length();
            n2 = text2.length();
            int[][] dp = new int[n1][n2];
            for(int[] rows : dp)
            {
                Arrays.fill(rows , -1);
            }
            return fun(text1 , text2 , 0 , 0 , dp);
        }

        public static int fun(String s1 , String s2 , int i1 , int i2 , int[][] dp)
        {
            if(i1>=s1.length() || i2>=s2.length())
            {
                return 0;
            }
            if(dp[i1][i2] != -1)
            {
                return dp[i1][i2];
            }
            if(s1.charAt(i1) == s2.charAt(i2))
            {
                return dp[i1][i2] = 1 + fun(s1 , s2 , i1+1 , i2+1 , dp);
            }
            return dp[i1][i2] = (int)Math.max(fun(s1 , s2 , i1+1 , i2 , dp) , fun(s1 , s2 , i1 , i2+1 , dp));
        }


        // Recurssion
        // public int longestCommonSubsequence(String text1, String text2) {
        //     return fun(text1 , text2 , 0 , 0);
        // }

        // public static int fun(String s1 , String s2 , int i1 , int i2)
        // {
        //     if(i1>=s1.length() || i2>=s2.length())
        //     {
        //         return 0;
        //     }
        //     if(s1.charAt(i1) == s2.charAt(i2))
        //     {
        //         return 1 + fun(s1 , s2 , i1+1 , i2+1);
        //     }
        //     return Math.max(fun(s1 , s2 , i1+1 , i2) , fun(s1 , s2 , i1 , i2+1));
        // }
    }
}
