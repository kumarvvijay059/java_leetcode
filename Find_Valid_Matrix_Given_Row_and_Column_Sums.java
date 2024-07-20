import java.util.*;
import java.io.*;
import java.lang.*;
public class Find_Valid_Matrix_Given_Row_and_Column_Sums {
    class Solution {
        public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
            int nr = rowSum.length;
            int nc = colSum.length;
            HashSet<Integer> r_set = new HashSet<>();
            HashSet<Integer> c_set = new HashSet<>();
            int[][] mat = new int[nr][nc];
            while(r_set.size() != nr && c_set.size() != nc)
            {
                int min_r = minIndex(rowSum , r_set);
                int min_c = minIndex(colSum , c_set);
                if(rowSum[min_r]<colSum[min_c])
                {
                    mat[min_r][min_c] = rowSum[min_r];
                    colSum[min_c] = colSum[min_c] - rowSum[min_r];
                    r_set.add(min_r);
                }
                else
                {
                    mat[min_r][min_c] = colSum[min_c];
                    rowSum[min_r] = rowSum[min_r] - colSum[min_c];
                    c_set.add(min_c);
                }
            }
            return mat;
        }

        private int minIndex(int[] arr , HashSet<Integer> hs)
        {
            int min = Integer.MAX_VALUE;
            int ind = 0;
            for(int i = 0 ; i<arr.length ; i++)
            {
                if(arr[i]<min && !hs.contains(i))
                {
                    min = arr[i];
                    ind = i;
                }
            }
            return ind;
        }
    }
}
