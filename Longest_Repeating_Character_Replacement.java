import java.util.*;
public class Longest_Repeating_Character_Replacement {
    class Solution {
        public int characterReplacement(String s, int k) {
            int n = s.length();
            int[] hashing = new int[26];
            int l = 0;
            int r = 0;
            int maxlen = 0;
            int maxfreq = 0;
            int sum_total = 0;
            while(r<n)
            {
                hashing[s.charAt(r) - 'A']++;
                sum_total = 0;
                for(int i = 0 ; i<26 ; i++)
                {
                    if(maxfreq<hashing[i])
                    {
                        maxfreq = hashing[i];
                    }
                    sum_total += hashing[i];
                }
                while(sum_total - maxfreq > k)
                {
                    hashing[s.charAt(l) - 'A']--;
                    l++;
                    sum_total = 0;
                    maxfreq = 0;
                    for(int i = 0 ; i<26 ; i++)
                    {
                        if(maxfreq<hashing[i])
                        {
                            maxfreq = hashing[i];
                        }
                        sum_total += hashing[i];
                    }
                }
                if(sum_total - maxfreq <= k)
                {
                    maxlen = Math.max(maxlen , r-l+1);
                }
                r++;
            }
            return maxlen;
        }
    }
}
