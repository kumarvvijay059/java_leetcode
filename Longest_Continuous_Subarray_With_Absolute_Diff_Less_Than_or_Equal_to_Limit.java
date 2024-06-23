import java.util.*;
import java.io.*;
import java.lang.*;
public class Longest_Continuous_Subarray_With_Absolute_Diff_Less_Than_or_Equal_to_Limit {
    class Solution {
        public int longestSubarray(int[] nums, int limit) {
            int n = nums.length;
            LinkedList<Integer> inc = new LinkedList<>();
            LinkedList<Integer> dec = new LinkedList<>();
            int ans = 0;
            int l = 0;
            for(int r = 0 ; r<n ; r++)
            {
                int ele = nums[r];
                while(inc.size()>0 && ele<inc.getLast())
                {
                    inc.removeLast();
                }
                inc.add(ele);
                while(dec.size()>0 && ele>dec.getLast())
                {
                    dec.removeLast();
                }
                dec.add(ele);
                while(dec.getFirst() - inc.getFirst() > limit)
                {
                    if(nums[l] == dec.getFirst())
                    {
                        dec.removeFirst();
                    }
                    if(nums[l] == inc.getFirst())
                    {
                        inc.removeFirst();
                    }
                    l++;
                }
                int len = r - l + 1;
                ans = Math.max(ans , len);
            }
            return ans;
        }
    }
}
