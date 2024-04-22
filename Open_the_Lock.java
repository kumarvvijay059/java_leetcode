import java.util.*;
import java.io.*;
import java.lang.*;
public class Open_the_Lock {
    class Solution {
        public int openLock(String[] deadends, String target)
        {
            Queue<Pair<String , Integer>> q = new LinkedList<>();
            HashSet<String> hs = new HashSet<>(Arrays.asList(deadends));
            HashSet<String> hs_vis = new HashSet<>();
            if(hs.contains("0000"))
            {
                return -1;
            }
            q.offer(new Pair<>("0000" , 0));
            hs_vis.add("0000");
            while(!q.isEmpty())
            {
                Pair<String , Integer> p = q.poll();
                String s = p.getKey();
                int turns = p.getValue();
                if(s.equals(target))
                {
                    return turns;
                }
                for(int i = 0 ; i<=3 ; i++)
                {
                    for(int change : new int[]{1 , -1})
                    {
                        int new_digit = (s.charAt(i) - '0' + change + 10) % 10;
                        String new_s = s.substring(0 , i) + new_digit + s.substring(i+1);
                        if(!hs_vis.contains(new_s) && !hs.contains(new_s))
                        {
                            hs_vis.add(new_s);
                            q.offer(new Pair<>(new_s , turns+1));
                        }
                    }
                }
            }
            return -1;
        }
    }
}
