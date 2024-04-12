import java.util.*;
import java.io.*;
import java.lang.*;
public class Trapping_Rain_Water {
    class Solution {
        public int trap(int[] height)
        {
            int n = height.length;
            if (n <= 2) return 0;
            int l = 0;
            int r = n - 1;
            int l_max = 0;
            int r_max = 0;
            int count = 0;
            while(l < r)
            {
                if(height[l] < height[r])
                {
                    if(height[l] >= l_max)
                    {
                        l_max = height[l];
                    }
                    else
                    {
                        count += l_max - height[l];
                    }
                    l++;
                }
                else
                {
                    if(height[r] >= r_max)
                    {
                        r_max = height[r];
                    }
                    else
                    {
                        count += r_max - height[r];
                    }
                    r--;
                }
            }
            return count;
        }
    }


// class Solution {
//     public int trap(int[] height) {
//         int n = height.length;
//         int l = 0;
//         int r = n-1;
//         int b = 0;
//         int count = 0;
//         while(l<r)
//         {
//             while(l<=b)
//             {
//                 l++;
//             }
//             while(r<=b)
//             {
//                 r++;
//             }
//             int x = Math.min(height[r] , height[l]);
//             for(int i = l ; i<=r ; i++)
//             {
//                 if(height[i]<x)
//                 {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }
}
