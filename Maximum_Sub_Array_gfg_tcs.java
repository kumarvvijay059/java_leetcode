import java.util.*;
public class Maximum_Sub_Array_gfg_tcs {
    class Solution {

        ArrayList<Integer> findSubarray(int n, int a[]) {
            ArrayList<Integer> ans = new ArrayList<>();
            int st = 0;
            int end = -1;
            int start = -1;
            int mx = 0;
            int sum = 0;
            int mxlen = 0;
            for(int i = 0 ; i<n ; i++)
            {
                if(a[i]<0)
                {
                    st = i+1;
                    sum = 0;
                }
                else
                {
                    sum = sum + a[i];
                    if(sum>mx)
                    {
                        mx = sum;
                        start = st;
                        end = i;
                        mxlen = end - start;
                    }
                    else if(sum == mx)
                    {
                        int len = i - st;
                        if(len>mxlen)
                        {
                            start = st;
                            end = i;
                        }
                    }
                }
            }

            if(start == -1)
            {
                ans.add(-1);
                return ans;
            }
            for(int i = start ; i<=end ; i++)
            {
                ans.add(a[i]);
            }
            return ans;
        }
    }
}
