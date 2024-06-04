import java.util.*;
import java.io.*;
import java.lang.*;
public class Longest_Palindrome {
    class Solution {
        public int longestPalindrome(String s) {
            int n = s.length();
            HashSet<Character> hs = new HashSet<>();
            int ans = 0;
            for(char c : s.toCharArray())
            {
                if(hs.contains(c))
                {
                    ans = ans + 2;
                    hs.remove(c);
                }
                else
                {
                    hs.add(c);
                }
            }
            if(!hs.isEmpty())
            {
                ans = ans + 1;
            }
            return ans;
        }
    }
}
