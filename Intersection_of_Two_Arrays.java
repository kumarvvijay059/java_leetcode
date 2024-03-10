import java.util.*;
import java.io.*;
import java.lang.*;
public class Intersection_of_Two_Arrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> hs = new HashSet<>();
            ArrayList<Integer> al = new ArrayList<>();
            for(int e : nums1)
            {
                hs.add(e);
            }
            for(int e : nums2)
            {
                if(hs.contains(e))
                {
                    if(!al.contains(e))
                    {
                        al.add(e);
                    }
                }
            }
            int[] ans = new int[al.size()];
            for(int i = 0; i < al.size(); i++)
            {
                ans[i] = al.get(i);
            }
            return ans;
        }
    }
}
