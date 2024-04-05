import java.util.*;
import java.io.*;
import java.lang.*;
public class Make_The_String_Great {
    class Solution {
        public String makeGood(String s) {
            Stack<Character> st = new Stack<>();
            for(int i = 0 ; i<s.length() ; i++)
            {
                if(st.isEmpty())
                {
                    st.push(s.charAt(i));
                }
                else if(Math.abs(st.peek() - s.charAt(i)) == 32)
                {
                    st.pop();
                }
                else
                {
                    st.push(s.charAt(i));
                }
            }

            StringBuilder ans = new StringBuilder();
            while(!st.isEmpty())
            {
                ans.insert(0 , st.pop());
            }
            return ans.toString();
        }
    }
}
