import java.io.*;
import java.util.*;
import java.lang.*;
public class Unique_Number_of_Occurrences {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            int[] hashing = new int[2002];
            Arrays.fill(hashing , 0);
            for(int num : arr)
            {
                if(num>=0)
                {
                    hashing[num]++;
                }
                else
                {
                    int k = -num;
                    hashing[k+1000]++;
                }
            }
            HashSet<Integer> hs = new HashSet<>();
            for(int num : hashing)
            {
                if(num!=0)
                {
                    if(hs.contains(num))
                    {
                        return false;
                    }
                    hs.add(num);
                }
            }
            return true;
        }
    }
}
