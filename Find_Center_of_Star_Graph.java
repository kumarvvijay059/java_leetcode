import java.lang.*;
import java.io.*;
import java.util.*;
public class Find_Center_of_Star_Graph {
    class Solution {
        public int findCenter(int[][] edges) {
            int n = edges.length;
            int[] hash = new int[n+1];
            for(int[] nums : edges)
            {
                hash[nums[0]-1]++;
                hash[nums[1]-1]++;
            }
            for(int i = 0 ; i<=n ; i++)
            {
                if(hash[i] == n)
                {
                    return i+1;
                }
            }
            return 0;
        }
    }
}
