import java.util.*;
public class Magic_Squares_In_Grid {
    class Solution {
        public int numMagicSquaresInside(int[][] grid) {
            int nr = grid.length;
            int nc = grid[0].length;
            int count = 0;
            for(int str = 0 ; str<nr-2 ; str++)
            {
                for(int stc = 0 ; stc<nc-2 ; stc++)
                {
                    if(isValidMatrix(grid , str , stc))
                    {
                        count++;
                    }
                }
            }
            return count;
        }

        private boolean isValidMatrix(int[][] grid , int str , int stc)
        {
            if(grid[str+1][stc+1] != 5)
            {
                return false;
            }
            boolean[] num = new boolean[10];
            for(int r = str ; r<str+3 ; r++)
            {
                int rowSum = 0;
                for(int c = stc ; c<stc+3 ; c++)
                {
                    if(grid[r][c] < 1 || grid[r][c] > 9)
                    {
                        return false;
                    }
                    if(num[grid[r][c]])
                    {
                        return false;
                    }
                    num[grid[r][c]] = true;
                    rowSum += grid[r][c];
                }
                if(rowSum != 15)
                {
                    return false;
                }
            }


            for(int c = stc ; c<stc+3 ; c++)
            {
                int colSum = 0;
                for(int r = str ; r<str+3 ; r++)
                {
                    colSum += grid[r][c];
                }
                if(colSum != 15)
                {
                    return false;
                }
            }

            int diag1 = grid[str][stc] + grid[str+1][stc+1] + grid[str+2][stc+2];
            int diag2 = grid[str][stc+2] + grid[str+1][stc+1] + grid[str+2][stc];
            if(diag1 != 15 || diag2 != 15)
            {
                return false;
            }
            return true;
        }
    }
}
