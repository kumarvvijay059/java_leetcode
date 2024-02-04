import java.util.*;
import java.lang.*;
import java.io.*;
public class Minimum_Window_Substring {
    class Solution {
        public String minWindow(String s, String t) {
            if (s.isEmpty() || t.isEmpty()) {
                return "";
            }

            Map<Character, Integer> hm1 = new HashMap<>();
            for (char c : t.toCharArray()) {
                int count = hm1.getOrDefault(c, 0);
                hm1.put(c, count + 1);
            }

            int required = hm1.size();
            int l = 0, r = 0;
            int formed = 0;

            Map<Character, Integer> hm2 = new HashMap<>();
            int[] ans = { -1, 0, 0 };

            while (r < s.length()) {
                char c = s.charAt(r);
                int count = hm2.getOrDefault(c, 0);
                hm2.put(c, count + 1);

                if (hm1.containsKey(c) && hm2.get(c).intValue() == hm1.get(c).intValue()) {
                    formed++;
                }

                while (l <= r && formed == required) {
                    c = s.charAt(l);

                    if (ans[0] == -1 || r - l + 1 < ans[0]) {
                        ans[0] = r - l + 1;
                        ans[1] = l;
                        ans[2] = r;
                    }

                    hm2.put(c, hm2.get(c) - 1);
                    if (hm1.containsKey(c) && hm2.get(c).intValue() < hm1.get(c).intValue()) {
                        formed--;
                    }

                    l++;
                }

                r++;
            }

            return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
        }
    }
}
