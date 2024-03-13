import java.util.*;
import java.io.*;
import java.lang.*;
public class Find_the_Pivot_Integer {
    class Solution {
        public int pivotInteger(int n) {
            int i= n*(n+1)/2;
            int j = (int)Math.sqrt(i);
            if(j*j==i) return j;
            else return -1;
        }
    }

// class Solution {
//     public int pivotInteger(int n) {
//         for(int j = 1 ; j<=n ; j++)
//         {
//             int sum1 = 0;
//             int sum2 = 0;
//             for(int i = 1 ; i<=n ; i++)
//             {
//                 if(i<=j)
//                 {
//                     sum1 = sum1 + i;
//                 }
//                 if(i>=j)
//                 {
//                     sum2 = sum2 + i;
//                 }
//             }
//             if(sum1==sum2)
//             {
//                 return j;
//             }
//         }
//         return -1;
//     }
// }
}
