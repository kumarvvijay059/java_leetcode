import java.util.*;
import java.lang.*;
import java.io.*;
public class First_Unique_Character_in_a_String {
    class Solution {
        public int firstUniqChar(String s) {
            int[] hashing = new int[26];
            for(int i = 0 ; i<s.length() ; i++)
            {
                int a = s.charAt(i) - 'a';
                hashing[a]++;
            }
            int min = 1000000;
            for(int i = 0 ; i<s.length() ; i++)
            {
                if(hashing[s.charAt(i) - 'a'] == 1)
                {
                    return i;
                }
            }
            return -1;
        }
    }
}
