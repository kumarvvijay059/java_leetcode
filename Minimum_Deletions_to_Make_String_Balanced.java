import java.util.*;
public class Minimum_Deletions_to_Make_String_Balanced {
    class Solution {
        public int minimumDeletions(String s) {
            int n = s.length();
            int[] dp = new int[n];
            if(s.charAt(n-1) == 'a')
            {
                dp[n-1] = 1;
            }
            else
            {
                dp[n-1] = 0;
            }
            for(int i = n-2 ; i>=0 ; i--)
            {
                if(s.charAt(i) == 'a')
                {
                    dp[i] = dp[i+1] + 1;
                }
                else
                {
                    dp[i] = dp[i+1] + 0;
                }
            }
            int min = Integer.MAX_VALUE;
            int b_count = 0;
            for(int i = 0 ; i<n ; i++)
            {
                if(s.charAt(i) == 'b')
                {
                    min = Math.min(min , dp[i] + b_count);
                    b_count++;
                }
            }
            min = Math.min(min , b_count);
            if(min == Integer.MAX_VALUE)
            {
                return 0;
            }
            else
            {
                return min;
            }
        }
    }
}
