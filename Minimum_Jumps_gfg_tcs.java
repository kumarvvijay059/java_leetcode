import java.util.*;
public class Minimum_Jumps_gfg_tcs {
    class Solution {
        static int minJumps(int[] arr) {
            int n = arr.length;
            if(arr[0] == 0)
            {
                return -1;
            }
            int jump = 1;
            int curr_end = arr[0];
            int max_end = arr[0];
            for(int i = 1 ; i<n ; i++)
            {
                if(i == n-1)
                {
                    return jump;
                }
                max_end = Math.max(max_end , i+arr[i]);
                if(curr_end == i)
                {
                    jump++;
                    curr_end = max_end;
                }
                if(curr_end >= n-1)
                {
                    return jump;
                }
                if(max_end<=i)
                {
                    return -1;
                }
            }
            return -1;
        }
    }
}
