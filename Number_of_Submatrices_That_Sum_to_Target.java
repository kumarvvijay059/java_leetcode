import java.util.*;
import java.io.*;
import java.lang.*;
public class Number_of_Submatrices_That_Sum_to_Target {
    class Solution {
        public int numSubmatrixSumTarget(int[][] matrix, int target) {
            int row = matrix.length;
            int col = matrix[0].length;
            for(int r = 0 ; r<row ; r++)
            {
                for(int c = 1 ; c<col ; c++)
                {
                    matrix[r][c] = matrix[r][c] + matrix[r][c-1];
                }
            }
            int count = 0;
            for(int c1 = 0 ; c1<col ; c1++)
            {
                for(int c2 = c1 ; c2<col ; c2++)
                {
                    Map<Integer , Integer> mp = new HashMap<>();
                    mp.put(0,1);
                    int sum = 0;
                    for(int r = 0 ; r<row ; r++)
                    {
                        sum += matrix[r][c2] - (c1>0 ? matrix[r][c1-1] : 0);
                        count += mp.getOrDefault(sum - target , 0);
                        mp.put(sum , mp.getOrDefault(sum , 0)+1);
                    }
                }
            }
            return count;
        }
    }
}
