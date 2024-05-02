import java.util.*;
import java.io.*;
import java.lang.*;
public class Largest_Positive_Integer_That_Exists_With_Its_Negative {
    class Solution {
        public int findMaxK(int[] nums)
        {
            int[] hashing = new int[2001];
            for(int num : nums)
            {
                if(num<0)
                {
                    int x = -num;
                    hashing[1000+x]++;
                }
                else
                {
                    hashing[num]++;
                }
            }
            int max = 0;
            for(int i = 1 ; i<=1000 ; i++)
            {
                if(hashing[i] > 0 && hashing[1000+i] > 0)
                {
                    if(max<=i)
                    {
                        max = i;
                    }
                }
            }
            if(max == 0)
            {
                return -1;
            }
            return max;
        }
    }
}
