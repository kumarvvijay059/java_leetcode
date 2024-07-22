import java.util.*;
import java.io.*;
import java.lang.*;

public class Sort_the_People {
    class Solution {

        class Pair
        {
            String name;
            int height;

            Pair(String name , int height)
            {
                this.name = name;
                this.height = height;
            }
        }

        public String[] sortPeople(String[] names, int[] heights) {
            int n = names.length;
            String[] ans = new String[n];

            Pair[] p = new Pair[n];
            for(int i = 0 ; i<n ; i++)
            {
                p[i] = new Pair(names[i] , heights[i]);
            }

            Arrays.sort(p , new Comparator<Pair>(){
                @Override
                public int compare(Pair p1 , Pair p2)
                {
                    return p2.height - p1.height;
                }
            });

            for(int i = 0 ; i<n ; i++)
            {
                ans[i] = p[i].name;
            }
            return ans;
        }
    }
}
