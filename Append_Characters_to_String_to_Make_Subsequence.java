import java.util.*;
import java.io.*;
import java.lang.*;
public class Append_Characters_to_String_to_Make_Subsequence {
    class Solution {
        public int appendCharacters(String s, String t) {
            int n = s.length();
            int m = t.length();
            int i = 0 , j = 0;
            while(i<n && j<m)
            {
                if(s.charAt(i) == t.charAt(j))
                {
                    j++;
                }
                i++;
            }
            return m - j;
        }
    }
}
