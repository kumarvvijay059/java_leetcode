import java.util.*;
import java.io.*;
import java.lang.*;
public class Maximum_Nesting_Depth_of_the_Parentheses {
    class Solution {
        public int maxDepth(String s) {
            int n = s.length();
            int count = 0;
            int max = 0;
            for(int i = 0 ; i<n ; i++)
            {
                if(s.charAt(i) == '(')
                {
                    count++;
                }
                else if(s.charAt(i) == ')')
                {
                    count--;
                }
                if(max<count)
                {
                    max = count;
                }
            }
            return max;
        }
    }
}
