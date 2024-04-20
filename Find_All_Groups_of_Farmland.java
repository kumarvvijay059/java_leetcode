import java.util.*;
import java.io.*;
import java.lang.*;
public class Find_All_Groups_of_Farmland {
    class Solution {
        public int[][] findFarmland(int[][] land)
        {
            int m = land.length;
            int n = land[0].length;
            ArrayList<int[]> al = new ArrayList<>();
            for(int i = 0 ; i<m ; i++)
            {
                for(int j = 0 ; j<n ; j++)
                {
                    if(land[i][j] == 1)
                    {
                        int[] a = {i , j , i , j};
                        dfs(i , j , a , land);
                        al.add(a);
                    }
                }
            }
            int[][] ans = new int[al.size()][4];
            for(int i = 0 ; i<al.size() ; i++)
            {
                ans[i] = al.get(i);
            }
            return ans;
        }

        public static void dfs(int i , int j , int[] a , int[][] land)
        {
            if(i<0 || i>land.length-1 || j<0 || j>land[0].length-1 || land[i][j] == 0)
            {
                return;
            }
            land[i][j] = 0;
            if(i<a[0])
            {
                a[0] = i;
            }
            if(j<a[1])
            {
                a[1] = j;
            }
            if(i>a[2])
            {
                a[2] = i;
            }
            if(j>a[3])
            {
                a[3] = j;
            }
            dfs(i-1 , j , a , land);
            dfs(i+1 , j , a , land);
            dfs(i , j-1 , a , land);
            dfs(i , j+1 , a , land);
        }
    }
}
