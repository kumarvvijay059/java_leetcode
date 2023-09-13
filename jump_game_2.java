public class jump_game_2 {
    class Solution {
        public int jump(int[] nums) {
            // int n = nums.length;
            // int pos = 0;
            // int count = 0;
            // while(pos<=n - 1)
            // {
            //     int maxm = 0;
            //     for(int i = pos + 1 ; i<=nums[pos] + pos ; i++)
            //     {
            //         if(i>=n-1)
            //         {
            //             pos = i;
            //             break;
            //         }
            //         if(maxm<=nums[i])
            //         {
            //             maxm = nums[i];
            //             pos = i;
            //         }
            //     }
            //     count++;
            // }
            // return count;
            int farthest = 0;
            int jump = 0;
            int current = 0;
            for(int i = 0 ; i<nums.length - 1 ; i++)
            {
                farthest = Math.max(farthest , nums[i] + i);
                if(i==current)
                {
                    current = farthest;
                    jump++;
                }
            }
            return jump;
        }
    }
}
