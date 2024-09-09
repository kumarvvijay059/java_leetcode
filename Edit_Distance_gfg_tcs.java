import java.util.*;
public class Edit_Distance_gfg_tcs {
    class Solution {
        public int editDistance(String str1, String str2) {
            int[][] dp = new int[str1.length() + 1][str2.length() + 1];
            for (int[] arr : dp) {
                Arrays.fill(arr, -1);
            }
            return fun(str1, str2, str1.length(), str2.length(), dp);
        }

        private int fun(String s1, String s2, int m, int n, int[][] dp) {
            if (m == 0) {
                return n;
            }
            if (n == 0) {
                return m;
            }
            if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
                return fun(s1, s2, m - 1, n - 1, dp);
            }
            if (dp[m - 1][n - 1] != -1) {
                return dp[m - 1][n - 1];
            }

            int insert = fun(s1, s2, m, n - 1, dp);
            int remove = fun(s1, s2, m - 1, n, dp);
            int replace = fun(s1, s2, m - 1, n - 1, dp);

            int min = Math.min(insert, Math.min(remove, replace));
            return dp[m - 1][n - 1] = 1 + min;
        }
    }
}
