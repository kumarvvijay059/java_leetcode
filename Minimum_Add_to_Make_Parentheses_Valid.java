import java.util.*;
public class Minimum_Add_to_Make_Parentheses_Valid {
    class Solution {
        public int minAddToMakeValid(String s) {
            Stack<Character> st = new Stack<>();
            for(char c : s.toCharArray())
            {
                if(!st.isEmpty() && st.peek() == '(' && c == ')')
                {
                    st.pop();
                }
                else
                {
                    st.push(c);
                }
            }
            return st.size();
        }
    }
}
