import java.util.*;
import java.io.*;
import java.lang.*;
public class Minimum_Falling_Path_Sum_II {
    class Solution {
        public int minFallingPathSum(int[][] grid)
        {
            int n = grid.length, m = grid[0].length;
            int res = Integer.MAX_VALUE;
            int[][] dp = new int[n][m];
            for(int row[] : dp)
            {
                Arrays.fill(row, -1);
            }

            for(int j = 0; j < m; ++j)
            {
                dp[0][j] = grid[0][j];
            }

            for(int i = 1; i < n; ++i)
            {
                for(int j = 0; j < m; ++j)
                {
                    int temp = Integer.MAX_VALUE;
                    for(int k = 0; k < m; ++k)
                    {
                        if(j != k)
                        {
                            temp = Math.min(temp, grid[i][j] + dp[i - 1][k]);
                        }
                        dp[i][j] = temp;
                    }
                }
            }
            for(int j = 0; j < m; ++j)
            {
                res = Math.min(res, dp[n - 1][j]);
            }
            return res;
        }
    }



// Recurssion

// class Solution {
//     public int minFallingPathSum(int[][] grid)
//     {
//         return minFallingPathSumRecursive(grid, 0, -1);
//     }
//     private int minFallingPathSumRecursive(int[][] grid, int row, int prevCol)
//     {
//         if(row == grid.length - 1)
//         {
//             int min = Integer.MAX_VALUE;
//             for(int col = 0; col < grid[row].length; col++)
//             {
//                 if(col != prevCol)
//                 {
//                     min = Math.min(min, grid[row][col]);
//                 }
//             }
//             return min;
//         }
//         int minFallingPathSum = Integer.MAX_VALUE;
//         for(int col = 0; col < grid[row].length; col++)
//         {
//             if(col != prevCol)
//             {
//                 int fallingPathSum = minFallingPathSumRecursive(grid, row + 1, col) + grid[row][col];
//                 minFallingPathSum = Math.min(minFallingPathSum, fallingPathSum);
//             }
//         }
//         return minFallingPathSum;
//     }
// }




// class Solution {
//     public int minFallingPathSum(int[][] grid)
//     {
//         int n = grid.length;
//         int m = grid[0].length;
//         int min = 99999999;
//         for(int i = 0 ; i<m ; i++)
//         {
//             int a = fun(0 , i , -1 , grid);
//             min = Math.min(min , a);
//         }
//         return min;
//     }

//     public int fun(int r , int c , int last , int[][] grid)
//     {
//         if(r==grid.length-1)
//         {
//             return grid[r][c];
//         }
//         int mini = 99999999;
//         for(int i = 0 ; i<grid.length ; i++)
//         {
//             if(last!=i)
//             {
//                 int b = fun(r+1 , i , c , grid) + grid[r][c];
//                 mini = Math.min(mini , b);
//             }
//         }
//         return mini;
//     }
// }
}
