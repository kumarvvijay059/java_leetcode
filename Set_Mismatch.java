import java.util.*;
public class Set_Mismatch {
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int[] hashing = new int[nums.length];
            int[] ans = new int[2];
            // Arrays.fill(hashing , 0);
            for(int ele : nums)
            {
                hashing[ele - 1]++;
            }
            for(int i = 0 ; i<hashing.length ; i++)
            {
                if(hashing[i]==2)
                {
                    ans[0] = i+1;
                }
                if(hashing[i]==0)
                {
                    ans[1] = i+1;
                }
            }
            return ans;
        }
    }
}
