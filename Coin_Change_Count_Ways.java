import java.util.*;
public class Coin_Change_Count_Ways {
    class Solution {
        public long count(int coins[], int N, int sum) {
            long[][] dp = new long[N+1][sum+1];
            for(long[] arr : dp)
            {
                Arrays.fill(arr , -1);
            }
            return fun(coins , N , sum , dp);
        }

        private long fun(int[] coins , int n , int sum , long[][] dp)
        {
            if(sum == 0)
            {
                return 1;
            }
            if(sum<0)
            {
                return 0;
            }
            if(n<=0 && sum>0)
            {
                return 0;
            }
            if(dp[n][sum] != -1)
            {
                return dp[n][sum];
            }

            long inc = fun(coins , n , sum - coins[n-1] , dp);
            long exc = fun(coins , n-1 , sum , dp);
            return dp[n][sum] = inc + exc;
        }
    }
}
