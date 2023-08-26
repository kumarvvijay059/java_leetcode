import java.util.*;
import java.lang.*;
import java.io.*;
public class assign_cookies
{
    class Solution1 {
        public int findContentChildren(int[] g, int[] s)
        {
            int n1 = s.length;
            int n2 = g.length;
            int[] used1 = new int[n2];
            for(int i = 0 ; n2>i ; i++)
            {
                used1[i] = 0;
            }
            Arrays.sort(s);
            for(int i = 0 ; n1>i ; i++)
            {
                for(int j = 0 ; n2>j ; j++)
                {
                    if(used1[j]==0)
                    {
                        if(s[i]>=g[j])
                        {
                            used1[j] = 1;
                            break;
                        }
                    }

                }
            }
            int sum = 0;
            for(int i = 0 ; n2>i ; i++)
            {
                sum = sum + used1[i];
            }
            return sum;
        }
    }

    class Solution2 {
        public int findContentChildren(int[] g, int[] s)
        {
            int n1 = s.length;
            int n2 = g.length;
            Arrays.sort(s);
            Arrays.sort(g);
            int i = 0;
            int j = 0;
            while(i<n1 && j<n2)
            {
                if(s[i]>=g[j])
                {
                    i++;
                    j++;
                }
                else
                {
                    i++;
                }
            }
            return j;
        }
    }
}
