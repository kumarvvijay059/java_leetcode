import java.util.*;
import java.io.*;
import java.lang.*;
public class Longest_Ideal_Subsequence {
    class Solution {
        private int solveMemo(String s, int idx, int k, int[][] dp, char ch)
        {
            if(idx >= s.length())
            {
                return 0;
            }
            if(dp[idx][ch] != -1)
            {
                return dp[idx][ch];
            }
            int take = 0;
            int nontake = 0;
            if(Math.abs(ch - s.charAt(idx)) <= k || ch == '#')
            {
                take = 1 + solveMemo(s, idx + 1, k, dp, s.charAt(idx));
            }
            nontake = solveMemo(s, idx + 1, k, dp, ch);
            return dp[idx][ch] = Math.max(take, nontake);
        }




        public int longestIdealString(String s, int k)
        {
            int[][] dp = new int[s.length() + 1][130];
            for (int[] d : dp)
            {
                Arrays.fill(d, -1);
            }
            return solveMemo(s, 0, k, dp, '#');
        }
    }



//dp Tabulation

// class Solution {
//     public int longestIdealString(String s, int k)
//     {
//         int n = s.length();
//         int[] dp = new int[n];
//         int max = 0;
//         for (int i = 0; i < n; i++)
//         {
//             dp[i] = 1;
//             for (int j = 0; j < i; j++)
//             {
//                 if (Math.abs(s.charAt(j) - s.charAt(i)) <= k)
//                 {
//                     dp[i] = Math.max(dp[i], dp[j] + 1);
//                 }
//             }
//             max = Math.max(max, dp[i]);
//         }
//         return max;
//     }
// }



// dp Memoization

// class Solution {
//     public int longestIdealString(String s, int k)
//     {
//         int n = s.length();
//         int[][] dp = new int[n][n];
//         for (int[] row : dp)
//         {
//             Arrays.fill(row, -1);
//         }
//         int a = ans(0 , -1 , s , k , dp);
//         return a;
//     }

//     public int ans(int i , int last , String s , int k , int[][] dp)
//     {
//         if(i>=s.length())
//         {
//             return 0;
//         }
//         if(dp[i][last + 1] != -1)
//         {
//             return dp[i][last + 1];
//         }
//         int take = 0;
//         int no_take = 0;
//         if(last == -1 || Math.abs(s.charAt(last) - s.charAt(i)) <= k)
//         {
//             take = ans(i+1 , i , s , k , dp) + 1;
//         }
//         no_take = ans(i+1 , last , s , k , dp);
//         return dp[i][last+1] = Math.max(take , no_take);
//     }
// }


//Recurssion

// class Solution {
//     public int longestIdealString(String s, int k)
//     {
//         int a = ans(0 , -1 , s , k);
//         return a;
//     }

//     public int ans(int i , int last , String s , int k)
//     {
//         if(i>=s.length())
//         {
//             return 0;
//         }
//         int take = 0;
//         int no_take = 0;
//         if(last == -1 || Math.abs(s.charAt(last) - s.charAt(i)) <= k)
//         {
//             take = ans(i+1 , i , s , k) + 1;
//         }
//         no_take = ans(i+1 , last , s , k);
//         return Math.max(take , no_take);
//     }
// }
}
