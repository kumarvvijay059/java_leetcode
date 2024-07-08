import java.util.*;
import java.io.*;
import java.lang.*;
public class Find_the_Winner_of_the_Circular_Game {
    class Solution {
        public int findTheWinner(int n, int k) {
            ArrayList<Integer> l = new ArrayList<>();
            for(int i = 1 ; i<=n ; i++)
            {
                l.add(i);
            }
            int i = 0;
            k--;
            while(l.size()>1)
            {
                i += k;
                i %= l.size();
                l.remove(i);
            }
            return l.get(0);
        }
    }
}
