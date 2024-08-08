import java.util.*;
public class Spiral_Matrix_III {
    class Solution {
        public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
            int[][] ans = new int[rows*cols][2];
            int r = rStart;
            int c = cStart;
            int count = 0;
            ans[count][0] = r;
            ans[count][1] = c;
            count++;
            int i = 1;
            while(count<rows*cols)
            {
                //right
                for(int x = 1 ; x <= i ; x++)
                {
                    c = c + 1;
                    if(r>=0 && r<rows && c>=0 && c<cols)
                    {
                        ans[count][0] = r;
                        ans[count][1] = c;
                        count++;
                    }
                }

                //down
                for(int x = 1 ; x<=i ; x++)
                {
                    r = r + 1;
                    if(r>=0 && r<rows && c>=0 && c<cols)
                    {
                        ans[count][0] = r;
                        ans[count][1] = c;
                        count++;
                    }
                }

                i++;

                //left
                for(int x = 1 ; x<=i ; x++)
                {
                    c = c - 1;
                    if(r>=0 && r<rows && c>=0 && c<cols)
                    {
                        ans[count][0] = r;
                        ans[count][1] = c;
                        count++;
                    }
                }

                //up
                for(int x = 1 ; x<=i ; x++)
                {
                    r = r - 1;
                    if(r>=0 && r<rows && c>=0 && c<cols)
                    {
                        ans[count][0] = r;
                        ans[count][1] = c;
                        count++;
                    }
                }
                i++;
            }
            return ans;
        }
    }
}
