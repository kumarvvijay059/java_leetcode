import java.util.*;
public class Consecutive_1s_not_allowed_tcs_gfg {
    class Solution {
        long countStrings(int n)
        {
            int mod = 1000000007;
            long[][] dp = new long[n+1][2];
            dp[1][0] = 1;
            dp[1][1] = 1;
            for(int i = 2; i <= n; i++)
            {
                dp[i][0] = (dp[i-1][0] + dp[i-1][1]) % mod;
                dp[i][1] = dp[i-1][0] % mod;
            }
            return (dp[n][0] + dp[n][1]) % mod;
        }
    }






// class Solution {
//     long countStrings(int n) {
//         long dp[][] = new long[n+1][2];
//         for(long[] arr : dp)
//         {
//             Arrays.fill(arr , -1);
//         }
//         int mod = 1000000000+7;
//         return (fun(n , 1 , 0 , dp) + fun(n , 1 , 1 , dp))%mod;
//     }

//     private long fun(int n , int i , int last_digit , long[][] dp)
//     {
//         int mod = 1000000000+7;
//         if(i >= n)
//         {
//             return 1;
//         }
//         if(dp[i][last_digit] != -1)
//         {
//             return dp[i][last_digit];
//         }
//         if(last_digit == 1)
//         {
//             return fun(n , i+1 , 0 , dp)%mod;
//         }
//         else
//         {
//             long num0 = fun(n , i+1 , 0 , dp)%mod;
//             long num1 = fun(n , i+1 , 1 , dp)%mod;
//             return dp[i][last_digit] = (num0+num1)%mod;
//         }
//     }
// }
}
