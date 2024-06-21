import java.util.*;
import java.io.*;
import java.lang.*;
public class Grumpy_Bookstore_Owner {
    class Solution {
        public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
            int m = minutes;
            int n = customers.length;
            int sum = 0;
            for(int i = 0 ; i<n ; i++)
            {
                if(grumpy[i] == 0)
                {
                    sum = sum + customers[i];
                }
            }
            int max = 0;
            for(int st = 0 ; st<=n-m ; st++)
            {
                int end = st+m-1;
                int sumt = sum;
                for(int i = st ; i<=end ; i++)
                {
                    if(grumpy[i] == 1)
                    {
                        sumt = sumt + customers[i];
                    }
                }
                if(sumt>max)
                {
                    max = sumt;
                }
            }
            return max;
        }
    }

// class Solution {
//     public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
//         int m = minutes;
//         int n = customers.length;
//         int max = 0;
//         for(int st = 0 ; st<=n-m ; st++)
//         {
//             int end = st+m-1;
//             int sum = 0;
//             for(int i = 0 ; i<n ; i++)
//             {
//                 if(i>=st && i<=end)
//                 {
//                     sum = sum + customers[i];
//                 }
//                 else if(grumpy[i] == 0)
//                 {
//                     sum = sum + customers[i];
//                 }
//             }
//             if(sum>=max)
//             {
//                 max = sum;
//             }
//         }
//         return max;
//     }
// }
}
