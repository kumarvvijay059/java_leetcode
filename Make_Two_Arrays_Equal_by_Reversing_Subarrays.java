import java.util.*;
public class Make_Two_Arrays_Equal_by_Reversing_Subarrays {
    class Solution {
        public boolean canBeEqual(int[] target, int[] arr) {
            int n = arr.length;
            int[] hashing = new int[1000];
            for(int ele : arr)
            {
                hashing[ele - 1]++;
            }

            for(int ele : target)
            {
                hashing[ele - 1]--;
            }

            for(int i = 0 ; i<1000 ; i++)
            {
                if(hashing[i] != 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
