public class candy
{
    class Solution {
        public int candy(int[] ratings) {
            int n = ratings.length;
            int[] rl = new int[n];
            int[] lr = new int[n];
            int[] finale = new int[n];
            for(int i = 0 ; n>i ; i++)
            {
                rl[i] = 1;
                lr[i] = 1;
            }
            for(int i = 1 ; i<=n-1 ; i++)
            {
                if(ratings[i]>ratings[i-1])
                {
                    lr[i] = lr[i-1] + 1;
                }
            }
            for(int i = n-2 ;i>=0 ; i--)
            {
                if(ratings[i]>ratings[i+1])
                {
                    rl[i] = rl[i+1] + 1;
                }
            }
            for(int i = 0 ; n>i ; i++)
            {
                finale[i] = Math.max(lr[i] , rl[i]);
            }
            int sum = 0 ;
            for(int i = 0 ; n>i ; i++)
            {
                sum = sum + finale[i];
            }
            return sum;
        }
    }
}
