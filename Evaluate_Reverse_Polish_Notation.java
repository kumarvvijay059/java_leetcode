import java.util.*;
import java.lang.*;
import java.io.*;
public class Evaluate_Reverse_Polish_Notation {
    class Solution {
        public int evalRPN(String[] tokens) {
            int n = tokens.length;
            Stack<Integer> s = new Stack<>();
            int ans = 0;
            int op1 = 0;
            int op2 = 0;
            int num = 0;
            for(int i = 0 ; i<n ; i++)
            {
                if(tokens[i].equals("/"))
                {
                    op1 = s.pop();
                    op2 = s.pop();
                    ans = op2/op1;
                    s.push(ans);
                }
                else if(tokens[i].equals("*"))
                {
                    op1 = s.pop();
                    op2 = s.pop();
                    ans = op2 * op1;
                    s.push(ans);
                }
                else if(tokens[i].equals("+"))
                {
                    op1 = s.pop();
                    op2 = s.pop();
                    ans = op2 + op1;
                    s.push(ans);                }
                else if(tokens[i].equals("-"))
                {
                    op1 = s.pop();
                    op2 = s.pop();
                    ans = op2 - op1;
                    s.push(ans);
                }
                else
                {
                    num = Integer.valueOf(tokens[i]);
                    s.push(num);
                }
            }
            return s.pop();
        }
    }
}
