public class Minimum_String_Length_After_Removing_Substrings {
    class Solution {
        public int minLength(String s) {
            int n = s.length();
            char[] stack = new char[n];
            int top = -1;
            for(char c : s.toCharArray())
            {
                if(top != -1 && ((c=='B' && stack[top] == 'A') || (c=='D' && stack[top] == 'C')))
                {
                    top--;
                }
                else
                {
                    stack[top+1] = c;
                    top++;
                }
            }
            return top+1;



            // int n = s.length();
            // while(s.contains("AB") || s.contains("CD"))
            // {
            //     if(s.contains("AB"))
            //     {
            //         int ind = s.indexOf("AB");
            //         s = s.substring(0 , ind) + s.substring(ind+2 , s.length());
            //     }
            //     else
            //     {
            //         int ind = s.indexOf("CD");
            //         s = s.substring(0 , ind) + s.substring(ind+2 , s.length());
            //     }
            // }
            // return s.length();
        }
    }
}
