import java.util.*;
import java.io.*;
import java.lang.*;
public class Furthest_Building_You_Can_Reach {
    class Solution {
        public int furthestBuilding(int[] heights, int bricks, int ladders) {
            PriorityQueue<Integer> prq = new PriorityQueue<>();
            for (int i = 0; i < heights.length - 1; i++)
            {
                int diff = heights[i + 1] - heights[i];
                if (diff > 0)
                {
                    prq.add(diff);
                    if (prq.size() > ladders)
                    {
                        bricks = bricks - prq.poll();
                    }
                    if (bricks < 0)
                    {
                        return i;
                    }
                }
            }
            return heights.length - 1;
        }
    }


// Recursion - TLE
// class Solution {
//     public int furthestBuilding(int[] heights, int bricks, int ladders) {
//         return fun(heights , bricks , ladders , 0);
//     }

//     public static int fun(int[] h , int b , int l , int ind)
//     {
//         if(ind == h.length - 1)
//         {
//             return ind;
//         }
//         if(h[ind] >= h[ind+1])
//         {
//             return fun(h , b , l , ind+1);
//         }
//         if(b > h[ind+1] - h[ind] && l>0)
//         {
//             int f1 = fun(h , b - (h[ind+1] - h[ind]) , l , ind+1);
//             int f2 = fun(h , b , l-1 , ind+1);
//             return Math.max(f1 , f2);
//         }
//         if(b > h[ind+1] - h[ind])
//         {
//             return fun(h , b - (h[ind+1] - h[ind]) , l , ind+1);
//         }
//         if(l>0)
//         {
//             return fun(h , b , l-1 , ind+1);
//         }
//         return ind;
//     }
// }


// Wrong method
// class Solution {
//     public int furthestBuilding(int[] heights, int bricks, int ladders) {
//         int n = heights.length;
//         int i;
//         for(i = 0 ; i<n-1 ; i++)
//         {
//             if(heights[i]>=heights[i+1])
//             {
//                 continue;
//             }
//             else
//             {
//                 if(heights[i+1] - heights[i] <= bricks)
//                 {
//                     bricks = bricks - (heights[i+1] - heights[i]);
//                 }
//                 else
//                 {
//                     if(ladders>0)
//                     {
//                         ladders--;
//                     }
//                     else
//                     {
//                         return i;
//                     }
//                 }
//             }
//         }
//         return n-1;
//     }
// }
}
