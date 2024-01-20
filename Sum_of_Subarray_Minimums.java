import java.io.*;
import java.util.*;
import java.lang.*;
public class Sum_of_Subarray_Minimums {
    class Solution {
        public int sumSubarrayMins(int[] arr) {
            int mod = 1000000007;
            int[] nSum = nxtSmaller(arr);
            int[] pSum = prvSmaller(arr);
            long count = 0;
            for(int i = 0 ; i<arr.length ; i++)
            {
                int l = i-pSum[i];
                int r = nSum[i] - i;
                long product = (l*r)%mod;
                product = (product*arr[i])%mod;
                count = (count%mod + product)%mod;
            }
            return (int)count;
        }

        public static int[] nxtSmaller(int[] arr)
        {
            Stack<Integer> s = new Stack<>();
            int n = arr.length;
            int[] ans = new int[n];
            for(int i = n-1 ; i>=0 ; i--)
            {
                while(!s.isEmpty() && arr[s.peek()]>=arr[i])
                {
                    s.pop();
                }
                if(s.isEmpty())
                {
                    ans[i] = n;
                }
                else
                {
                    ans[i] = s.peek();
                }
                s.push(i);
            }
            return ans;
        }

        public static int[] prvSmaller(int[] arr)
        {
            Stack<Integer> s = new Stack<>();
            int n = arr.length;
            int[] ans = new int[n];
            for(int i = 0 ; i<n ; i++)
            {
                while(!s.isEmpty() && arr[s.peek()]>arr[i])
                {
                    s.pop();
                }
                if(s.isEmpty())
                {
                    ans[i] = -1;
                }
                else
                {
                    ans[i] = s.peek();
                }
                s.push(i);
            }
            return ans;
        }
    }
}
