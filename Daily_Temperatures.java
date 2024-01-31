import java.util.*;
import java.lang.*;
import java.io.*;
public class Daily_Temperatures {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            Stack<Integer> s = new Stack<>();
            int n = temperatures.length;
            int[] ans = new int[n];
            for(int i = n-1 ; i>=0 ; i--)
            {
                while(!s.empty() && temperatures[i] >= temperatures[s.peek()])
                {
                    s.pop();
                }

                if(!s.empty())
                {
                    ans[i] = s.peek() - i;
                }

                s.push(i);
            }
            return ans;
        }
    }
}
