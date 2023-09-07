public class find_the_score_of_all_prefixes_of_an_array {
    class Solution {
        public long[] findPrefixScore(int[] nums) {
            // int n = nums.length;
            // long[] ans = new long[n];
            // for(int i = 0 ; i<n ; i++)
            // {
            //     int[] conver = new int[i+1];
            //     long sum = 0;
            //     for(int j = 0 ; j<=i ; j++)
            //     {
            //         int max = 0;
            //         for(int k = 0 ; k<=j ; k++)
            //         {
            //             if(nums[k]>max)
            //             {
            //                 max = nums[k];
            //             }
            //         }
            //         conver[j] = nums[j] + max;
            //         sum = sum + conver[j];
            //     }
            //     ans[i] = sum;
            // }
            // return ans;
            int n = nums.length;
            int max = nums[0];
            long[] ans = new long[n];

            for(int i = 0 ; i<n ; i++)
            {
                if(max<nums[i])
                {
                    max = nums[i];
                }
                if(i==0)
                {
                    ans[i] = nums[i] + max;
                }
                else
                {
                    ans[i] = ans[i-1] + nums[i] + max;
                }
            }
            return ans;
//            int n = nums.length;
//            int mx = 0;
//            long[] ans = new long[n];
//            long sum = 0;
//            for(int i = 0 ; i<n ; i++)
//            {
//                mx = Math.max(mx,nums[i]);
//                sum += (mx+nums[i]);
//                ans[i] = sum;
//            }
//            return ans;
        }
    }
}
