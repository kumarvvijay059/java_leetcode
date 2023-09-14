public class koko_eating_bananas {
    class Solution_1{
        public int minEatingSpeed(int[] piles, int h) {
            int n = piles.length;
            long start = 1;
            long end = 1000000000;
            while(start<=end)
            {
                long mid = start + (end - start)/2;
                long a = 0;
                long r;
                long q;
                for(int i = 0 ; i<n ; i++)
                {
                    r = (long)piles[i]%mid;
                    q = (long)piles[i]/mid;
                    if(r==0)
                    {
                        a = a + q;
                    }
                    else
                    {
                        a = a + (q + 1);
                    }
                }
                // if(a==h)
                // {
                //     return (int)mid;
                // }
                if(a>h)
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
            return (int)start;

        }
    }

    class Solution_2{
        public int minEatingSpeed(int[] piles, int h) {
            int n = piles.length;
            int max = 0;
            for(int i = 0 ; i<n ; i++)
            {
                if(max<piles[i])
                {
                    max = piles[i];
                }
            }
            long start = 1;
            long end = max;
            long mid = 0;
            while(start<=end)
            {
                mid = start + (end - start)/2;
                long a = 0;
                long r;
                long q;
                for(int i = 0 ; i<n ; i++)
                {
                    r = (long)piles[i]%mid;
                    q = (long)piles[i]/mid;
                    if(r==0)
                    {
                        a = a + q;
                    }
                    else
                    {
                        a = a + (q + 1);
                    }
                }
                // if(a==h)
                // {
                //     return (int)mid;
                // }
                if(a>h)
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
            return (int)start;

        }
    }
}
