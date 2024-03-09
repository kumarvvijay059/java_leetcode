import java.util.*;
import java.io.*;
import java.lang.*;
public class Minimum_Common_Value {
    class Solution {
        public int getCommon(int[] nums1, int[] nums2) {
            HashSet<Integer> hs = new HashSet<>();
            for(int e : nums1)
            {
                hs.add(e);
            }
            for(int e : nums2)
            {
                if(hs.contains(e))
                {
                    return e;
                }
            }
            return -1;
        }
    }
}
