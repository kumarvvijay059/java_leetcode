import java.util.*;
import java.io.*;
import java.lang.*;
public class Out_of_Boundary_Paths {
    class Solution {
        //DP Memoization
        public int findPaths(int m, int n, int maxMove, int startRow, int startColumn)
        {
            long[][][] dp = new long[m][n][maxMove + 1];
            for (long[][] row1 : dp)
            {
                for (long[] row2 : row1)
                {
                    Arrays.fill(row2, -1);
                }
            }
            return (int) fun(m, n, startRow, startColumn, maxMove, 0, dp);
        }

        public static long fun(int m, int n, int r, int c, int mM, int cM, long[][][] dp)
        {
            long mod = 1000000007L;
            if (cM > mM) {
                return 0;
            }
            if (r >= m || r < 0 || c >= n || c < 0)
            {
                return 1;
            }
            if (dp[r][c][cM] != -1)
            {
                return dp[r][c][cM];
            }
            long up = fun(m, n, r - 1, c, mM, cM + 1, dp) % mod;
            long down = fun(m, n, r + 1, c, mM, cM + 1, dp) % mod;
            long left = fun(m, n, r, c - 1, mM, cM + 1, dp) % mod;
            long right = fun(m, n, r, c + 1, mM, cM + 1, dp) % mod;
            return dp[r][c][cM] = (up + down + left + right) % mod;
        }
    }

// Dp Memoization
// class Solution {
//     public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
//         int[][][] dp = new int[m][n][maxMove+1];
//         for(int[][] row1 : dp)
//         {
//             for(int[] row2 : row1)
//             {
//                 Arrays.fill(row2 , -1);
//             }
//         }
//         return fun(m , n , startRow , startColumn , maxMove , 0 , dp);
//     }

//     public static int fun(int m , int n , int r , int c , int mM , int cM , int[][][] dp)
//     {
//         int mod = 1000000007;
//         if(cM>mM)
//         {
//             return 0;
//         }
//         if(r>=m || r<0 || c>=n || c<0)
//         {
//             return 1;
//         }
//         if(dp[r][c][cM] != -1)
//         {
//             return dp[r][c][cM];
//         }
//         int up = fun(m , n , r-1 , c , mM , cM+1 , dp)%mod;
//         int down = fun(m , n , r+1 , c , mM , cM+1 , dp)%mod;
//         int left = fun(m , n , r , c-1 , mM , cM+1 , dp)%mod;
//         int right = fun(m , n , r , c+1 , mM , cM+1 , dp)%mod;
//         return dp[r][c][cM] = (up + down + left + right)%mod;
//     }
// }


//Recursion
// class Solution {
//     public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
//         return fun(m , n , startRow , startColumn , maxMove , 0);
//     }

//     public static int fun(int m , int n , int r , int c , int mM , int cM)
//     {
//         int mod = 1000000007;
//         if(cM>mM)
//         {
//             return 0;
//         }
//         if(r>=m || r<0 || c>=n || c<0)
//         {
//             return 1;
//         }
//         int up = fun(m , n , r-1 , c , mM , cM+1)%mod;
//         int down = fun(m , n , r+1 , c , mM , cM+1)%mod;
//         int left = fun(m , n , r , c-1 , mM , cM+1)%mod;
//         int right = fun(m , n , r , c+1 , mM , cM+1)%mod;
//         return (up + down + left + right)%mod;
//     }
// }
}
