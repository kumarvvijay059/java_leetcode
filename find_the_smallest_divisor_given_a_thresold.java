public class find_the_smallest_divisor_given_a_thresold {
    class Solution {
        public int smallestDivisor(int[] nums, int threshold) {
            int n = nums.length;
            int l = 1;
            int h = 1000000;
            int mid = 0;
            while(l<=h)
            {
                mid = l + (h - l)/2;
                int q;
                int sum = 0;
                for(int i = 0 ; n>i ; i++)
                {
                    if(nums[i]%mid==0)
                    {
                        q = nums[i]/mid;
                    }
                    else
                    {
                        q = (nums[i]/mid) + 1;
                    }
                    sum = sum + q;
                }
                if(sum>threshold)
                {
                    l = mid + 1;
                }
                else
                {
                    h = mid - 1;
                }
            }
            return l;
        }
    }
}
