import java.util.*;
import java.io.*;
import java.lang.*;
public class Maximal_Rectangle {
    class Solution {
        public int maximalRectangle(char[][] matrix)
        {
            if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            {
                return 0;
            }
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[] heights = new int[cols + 1];
            int maxarea = 0;

            for(char[] row : matrix)
            {
                for (int i = 0; i < cols; i++)
                {
                    heights[i] = (row[i] == '1') ? heights[i] + 1 : 0;
                }
                int n = heights.length;
                for (int i = 0; i < n; i++)
                {
                    for (int j = i, minHeight = Integer.MAX_VALUE; j < n; j++)
                    {
                        minHeight = Math.min(minHeight, heights[j]);
                        int area = minHeight * (j - i + 1);
                        maxarea = Math.max(maxarea, area);
                    }
                }
            }

            return maxarea;
        }
    }
}
