import java.util.*;
import java.io.*;
import java.lang.*;
public class Find_the_Town_Judge {
    class Solution {
        public int findJudge(int n, int[][] trust) {
            int judge = -1;
            int[] hashing = new int[n+1];
            for(int i = 0 ; i<trust.length ; i++)
            {
                hashing[trust[i][1]]++;
            }
            for(int i = 1 ; i<=n ; i++)
            {
                if(hashing[i] == n-1)
                {
                    judge = i;
                }
            }
            for(int i = 0 ; i<trust.length ; i++)
            {
                if(trust[i][0] == judge)
                {
                    return -1;
                }
            }
            return judge;
        }
    }
}
