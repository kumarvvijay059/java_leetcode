import java.util.*;
import java.io.*;
import java.lang.*;
public class K_th_Smallest_Prime_Fraction {
    class Solution {
        public int[] kthSmallestPrimeFraction(int[] arr, int k) {
            int n = arr.length;
            double l = arr[0]/arr[n-1];
            double h = 1;
            while(l<h)
            {
                double mid = (l+h)/2;
                int arr1[] = fun(arr , mid);
                if(k<arr1[0])
                {
                    h = mid;
                }
                else if(k>arr1[0])
                {
                    l = mid;
                }
                else
                {
                    return new int[]{arr1[1] , arr1[2]};
                }
            }
            return null;
        }

        public int[] fun(int arr[] , double target)
        {
            int cnt = 0;
            int i = 0;
            int n = arr.length;
            int num = arr[0];
            int den = arr[n-1];
            for(int j = 1; j<n ; j++)
            {
                while(arr[i]<=arr[j]*target)
                {
                    i++;
                }
                cnt = cnt + i;
                if(i>0 && arr[i-1]*den > num*arr[j])
                {
                    num = arr[i-1];
                    den = arr[j];
                }
            }
            return new int[]{cnt , num , den};
        }
    }
}
