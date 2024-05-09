public class min_num_of_days_to_make_m_bouquets
{
    class Solution {
        public int minDays(int[] bloomDay, int m, int k) {
            int n = bloomDay.length;
            if((long)m*k>n)
            {
                return -1;
            }
            long l = 0;
            long h = 1000000000;
            long mid = 0;
            while(l<=h)
            {
                mid = l + (h-l)/2;
                int a = 0;
                int b = 0;
                for(int i = 0 ; n>i ; i++)
                {
                    if(mid>=bloomDay[i])
                    {
                        a++;
                    }
                    else
                    {
                        a = 0;
                    }
                    if(a==k)
                    {
                        b++;
                        a = 0;
                    }
                }
                if(b<m)
                {
                    l = mid + 1;
                }
                else
                {
                    h = mid - 1;
                }
            }
            return (int)l;
        }
    }
}
