import java.util.*;
import java.lang.*;
import java.io.*;
public class Minimum_Cost_to_Convert_String_I {
    class Solution {
        public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
            long n = original.length;
            long infinity = 1000000000000000000l;
            long[][] mat = new long[26][26];
            for(int i = 0 ; i<26 ; i++)
            {
                for(int j = 0 ; j<26 ; j++)
                {
                    if(i == j)
                    {
                        mat[i][j] = 0;
                    }
                    else
                    {
                        mat[i][j] = infinity;
                    }
                }
            }

            for(int i = 0 ; i<n ; i++)
            {
                char c1 = original[i];
                char c2 = changed[i];
                int x = (int)c1 - 97;
                int y = (int)c2 - 97;
                mat[x][y] = Math.min(mat[x][y],(long)cost[i]);

            }

            for(int k = 0 ; k<26 ; k++)
            {
                for(int i = 0 ; i<26 ; i++)
                {
                    for(int j = 0 ; j<26 ; j++)
                    {
                        if(mat[i][j] > mat[i][k] + mat[k][j])
                        {
                            mat[i][j] = mat[i][k] + mat[k][j];
                        }
                    }
                }
            }

            long ans = 0;
            for(int i = 0 ; i<source.length() ; i++)
            {
                if(source.charAt(i) != target.charAt(i))
                {
                    int x = (int)source.charAt(i) - 97;
                    int y = (int)target.charAt(i) - 97;
                    if(mat[x][y] >= 1000000000000000000l)
                    {
                        return -1;
                    }
                    ans = ans + mat[x][y];
                }
            }
            return ans;
        }
    }
}
