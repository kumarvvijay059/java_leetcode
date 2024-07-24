import java.util.*;
import java.io.*;
import java.lang.*;
public class Sort_the_Jumbled_Numbers {
    class Solution {
        public int[] sortJumbled(int[] mapping, int[] nums) {
            int n = nums.length;
            Integer[] nums1 = new Integer[n];
            Integer[] nums2 = new Integer[n];
            for(int i = 0 ; i<n ; i++)
            {
                nums1[i] = nums[i];
                int ele = nums[i];
                int new_num = 0;
                int mult = 1;
                while(ele>0)
                {
                    int r = ele%10;
                    ele = ele/10;
                    new_num = new_num + mapping[r] * mult;
                    mult = mult * 10;
                }
                if(nums[i] == 0)
                {
                    nums2[i] = mapping[0];
                }
                else
                {
                    nums2[i] = new_num;
                }
            }

            HashMap<Integer , Integer> hm = new HashMap<>();
            for(int i = 0 ; i<n ; i++)
            {
                hm.put(nums1[i] , nums2[i]);
            }

            Arrays.sort(nums1 , new Comparator<Integer>() {
                @Override
                public int compare(Integer a , Integer b)
                {
                    return hm.get(a) - hm.get(b);
                }
            });

            for(int i = 0; i<n ; i++)
            {
                nums[i] = nums1[i];
            }
            return nums;
        }
    }
}
