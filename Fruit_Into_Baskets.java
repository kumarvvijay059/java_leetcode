import java.util.*;
public class Fruit_Into_Baskets {
    class Solution {
        public int totalFruit(int[] fruits) {
            int n = fruits.length;
            int l = 0;
            int r = 0;
            int maxlen = 0;
            int[] hashing = new int[n];
            int type_count = 0;
            while(r<n)
            {
                hashing[fruits[r]]++;
                if(hashing[fruits[r]] == 1)
                {
                    type_count++;
                }
                while(type_count>2)
                {
                    hashing[fruits[l]]--;
                    if(hashing[fruits[l]] == 0)
                    {
                        type_count--;
                    }
                    l++;
                }
                if(type_count<=2)
                {
                    maxlen = Math.max(maxlen , r-l+1);
                }
                r++;
            }
            return maxlen;
        }
    }
}
