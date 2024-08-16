import java.io.*;
import java.lang.*;
import java.util.*;
public class Minimum_Falling_Path_Sum {
    class Solution {

        //DP Tabulation
        public int minFallingPathSum(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            int[][] dp = new int[n][m];
            for(int i = 0 ; i<m ; i++)
            {
                dp[0][i] = matrix[0][i];
            }
            for(int i = 1 ; i<n ; i++)
            {
                for(int j = 0 ; j<m ; j++)
                {
                    int down = matrix[i][j] + dp[i-1][j];
                    int down_l = Integer.MAX_VALUE;
                    int down_r = Integer.MAX_VALUE;
                    if(j-1>=0)
                    {
                        down_l = matrix[i][j] + dp[i-1][j-1];
                    }
                    if(j+1<m)
                    {
                        down_r = matrix[i][j] + dp[i-1][j+1];
                    }
                    dp[i][j] = Math.min(down , Math.min(down_l , down_r));
                }
            }
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i<m ; i++)
            {
                if(min>dp[n-1][i])
                {
                    min = dp[n-1][i];
                }
            }
            return min;
        }


        //DP Memoization

        // public int minFallingPathSum(int[][] matrix) {
        //     int n = matrix.length;
        //     int m = matrix[0].length;
        //     int[][] dp = new int[n][m];
        //     for(int rows[] : dp)
        //     {
        //         Arrays.fill(rows , -1);
        //     }
        //     int min = Integer.MAX_VALUE;
        //     for(int i = 0 ; i<m ; i++)
        //     {
        //         int mini = fun(matrix , n , m , 0 , i , dp);
        //         if(min>mini)
        //         {
        //             min = mini;
        //         }
        //     }
        //     return min;
        // }

        // public static int fun(int[][] matrix , int r , int c , int row , int col , int[][] dp)
        // {
        //     if(col<0 || col>=c)
        //     {
        //         return (int)1e5;
        //     }
        //     if(row == r-1)
        //     {
        //         return matrix[row][col];
        //     }
        //     if(dp[row][col] != -1)
        //     {
        //         return dp[row][col];
        //     }
        //     int down = matrix[row][col] + fun(matrix , r , c , row+1 , col , dp);
        //     int down_l = matrix[row][col] + fun(matrix , r , c , row+1 , col-1 , dp);
        //     int down_r = matrix[row][col] + fun(matrix , r , c , row+1 , col+1 , dp);
        //     int min = Math.min(down , Math.min(down_l , down_r));
        //     return dp[row][col] = min;
        // }


        // Recursion

        // public int minFallingPathSum(int[][] matrix) {
        //     int n = matrix.length;
        //     int m = matrix[0].length;
        //     int min = Integer.MAX_VALUE;
        //     for(int i = 0 ; i<m ; i++)
        //     {
        //         int mini = fun(matrix , n , m , 0 , i);
        //         if(min>mini)
        //         {
        //             min = mini;
        //         }
        //     }
        //     return min;
        // }

        // public static int fun(int[][] matrix , int r , int c , int row , int col)
        // {
        //     if(col<0 || col>=c)
        //     {
        //         return (int)1e5;
        //     }
        //     if(row == r-1)
        //     {
        //         return matrix[row][col];
        //     }
        //     int down = matrix[row][col] + fun(matrix , r , c , row+1 , col);
        //     int down_l = matrix[row][col] + fun(matrix , r , c , row+1 , col-1);
        //     int down_r = matrix[row][col] + fun(matrix , r , c , row+1 , col+1);
        //     int min = Math.min(down , Math.min(down_l , down_r));
        //     return min;
        // }
    }
}
