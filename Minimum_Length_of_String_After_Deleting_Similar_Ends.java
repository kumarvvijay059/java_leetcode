import java.util.*;
import java.io.*;
import java.lang.*;
public class Minimum_Length_of_String_After_Deleting_Similar_Ends {
    class Solution {
        public int minimumLength(String s) {
            int l = 0;
            int r = s.length() - 1;
            int ans = s.length();
            while(l<r)
            {
                int count_l = 1;
                int count_r = 1;
                while(s.charAt(l) == s.charAt(l+1) && l+1<r)
                {
                    l++;
                    count_l++;
                }
                while(s.charAt(r) == s.charAt(r-1) && l<r-1)
                {
                    r--;
                    count_r++;
                }
                if(s.charAt(l) == s.charAt(r))
                {
                    ans = ans - count_l - count_r;
                }
                else
                {
                    break;
                }
                l++;
                r--;
            }
            return ans;
        }
    }
}
