import java.util.*;
import java.io.*;
import java.lang.*;
public class Cherry_Pickup_II {
    // Dp Memoization
    class Solution {
        public int cherryPickup(int[][] grid) {
            int nrow = grid.length;
            int ncol = grid[0].length;
            int[][][] dp = new int[nrow][ncol][ncol];
            for(int[][] rows : dp)
            {
                for(int[] rows1 : rows)
                {
                    Arrays.fill(rows1 , -1);
                }
            }
            return fun(nrow , ncol , 0 , 0 , ncol-1 , grid , dp);
        }

        public static int fun(int nrow , int ncol , int r , int c1 , int c2 , int[][] grid , int[][][] dp)
        {
            if(c1<0 || c2<0 || c1>=ncol || c2>=ncol)
            {
                return 0;
            }
            if(r >= nrow-1)
            {
                if(c1==c2)
                {
                    return grid[r][c1];
                }
                else
                {
                    return grid[r][c1] + grid[r][c2];
                }
            }
            if(dp[r][c1][c2] != -1)
            {
                return dp[r][c1][c2];
            }
            int max_cherry = 0;
            for(int i = -1 ; i<=1 ; i++)
            {
                for(int j = -1 ; j<=1 ; j++)
                {
                    int cherry;
                    if(c1==c2)
                    {
                        cherry = grid[r][c1] + fun(nrow , ncol , r+1 , c1+i , c2+j , grid , dp);
                    }
                    else
                    {
                        cherry = grid[r][c1] + grid[r][c2] + fun(nrow , ncol , r+1 , c1+i , c2+j , grid , dp);
                    }
                    if(max_cherry<cherry)
                    {
                        max_cherry = cherry;
                    }
                }
            }
            return dp[r][c1][c2] = max_cherry;
        }
    }


//Recurssion

// class Solution {
//     public int cherryPickup(int[][] grid) {
//         int nrow = grid.length;
//         int ncol = grid[0].length;
//         return fun(nrow , ncol , 0 , 0 , ncol-1 , grid);
//     }

//     public static int fun(int nrow , int ncol , int r , int c1 , int c2 , int[][] grid)
//     {
//         if(c1<0 || c2<0 || c1>=ncol || c2>=ncol)
//         {
//             return 0;
//         }
//         if(r >= nrow-1)
//         {
//             if(c1==c2)
//             {
//                 return grid[r][c1];
//             }
//             else
//             {
//                 return grid[r][c1] + grid[r][c2];
//             }
//         }
//         int max_cherry = 0;
//         for(int i = -1 ; i<=1 ; i++)
//         {
//             for(int j = -1 ; j<=1 ; j++)
//             {
//                 int cherry;
//                 if(c1==c2)
//                 {
//                     cherry = grid[r][c1] + fun(nrow , ncol , r+1 , c1+i , c2+j , grid);
//                 }
//                 else
//                 {
//                     cherry = grid[r][c1] + grid[r][c2] + fun(nrow , ncol , r+1 , c1+i , c2+j , grid);
//                 }
//                 if(max_cherry<cherry)
//                 {
//                     max_cherry = cherry;
//                 }
//             }
//         }
//         return max_cherry;
//     }
// }
}
