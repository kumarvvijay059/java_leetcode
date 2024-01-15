import java.util.*;
import java.lang.*;
import java.io.*;
public class Find_Players_With_Zero_or_One_Losses {
    class Solution {
        public List<List<Integer>> findWinners(int[][] matches) {
            int[] played = new int[100000];
            int[] lost = new int[100000];
            Arrays.fill(played , 0);
            Arrays.fill(lost , 0);
            for(int[] rows : matches)
            {
                played[rows[0]-1]++;
                played[rows[1]-1]++;
                lost[rows[1]-1]++;
            }
            List<List<Integer>> ans = new ArrayList<>(2);
            ans.add(new ArrayList<Integer>());
            ans.add(new ArrayList<Integer>());
            for(int i = 0 ; i<100000 ; i++)
            {
                if(played[i]!=0 && lost[i]==0)
                {
                    ans.get(0).add(i+1);
                }
                else if(played[i]!=0 && lost[i]==1)
                {
                    ans.get(1).add(i+1);
                }
            }
            return ans;
        }
    }
}
