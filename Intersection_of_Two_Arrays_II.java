import java.util.*;
import java.io.*;
import java.lang.*;
public class Intersection_of_Two_Arrays_II {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            ArrayList<Integer> ans = new ArrayList<>();
            int[] hashing = new int[1001];
            for(int ele : nums1)
            {
                hashing[ele]++;
            }
            for(int ele : nums2)
            {
                if(hashing[ele] > 0)
                {
                    ans.add(ele);
                    hashing[ele]--;
                }
            }
            int[] ans1 = new int[ans.size()];
            for(int i = 0 ; i<ans.size() ; i++)
            {
                ans1[i] = ans.get(i);
            }
            return ans1;
        }
    }
}
