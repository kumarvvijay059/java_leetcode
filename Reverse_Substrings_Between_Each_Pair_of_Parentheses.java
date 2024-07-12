import java.util.*;
import java.io.*;
import java.lang.*;
public class Reverse_Substrings_Between_Each_Pair_of_Parentheses {
    class Solution {
        public String reverseParentheses(String s)
        {
            int n = s.length();
            Stack<Integer> stack = new Stack<>();
            for(int i = 0 ; i<s.length() ; i++)
            {
                if(s.charAt(i) == '(')
                {
                    stack.push(i);
                }
                else if(s.charAt(i) == ')')
                {
                    int st = stack.pop();
                    int end = i;
                    s = s.substring(0 , st) + reverse(s.substring(st+1 , end)) + s.substring(end+1 , s.length());
                    i = st - 1;
                }
            }
            return s;
        }

        private String reverse(String s)
        {
            int i = 0;
            int j = s.length() - 1;
            char[] c = s.toCharArray();
            while(i<j)
            {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
            s = new String(c);
            return s;
        }
    }
}
