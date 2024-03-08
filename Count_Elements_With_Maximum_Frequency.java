import java.util.*;
import java.io.*;
import java.lang.*;
public class Count_Elements_With_Maximum_Frequency {
    class Solution {
        public int maxFrequencyElements(int[] nums) {
            int n = nums.length;
            int[] hashing = new int[101];
            for(int i = 0 ; i<n ; i++)
            {
                hashing[nums[i]]++;
            }
            int max = 0;
            for(int i = 0 ; i<101 ; i++)
            {
                max = Math.max(max, hashing[i]);
            }
            int count = 0;
            for(int i = 0 ; i<n ;i++)
            {
                if(hashing[nums[i]] == max)
                {
                    count++;
                }
            }
            return count;
        }
    }



}
