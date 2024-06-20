import java.util.*;
import java.io.*;
import java.lang.*;
public class Magnetic_Force_Between_Two_Balls {
    class Solution {
        public int maxDistance(int[] position, int m) {
            int n = position.length;
            Arrays.sort(position);
            int l = 0;
            int h = position[n-1];
            int mid = 0;
            int ans = 0;
            while(l<=h)
            {
                mid = l + (h - l)/2;
                if(valid(mid , position , m))
                {
                    ans = mid;
                    l = mid+1;
                }
                else
                {
                    h = mid-1;
                }
            }
            return ans;
        }

        private boolean valid(int gap , int[] a , int m)
        {
            int prev = a[0];
            int placed = 1;
            for(int i = 1 ; i<a.length ; i++)
            {
                if(a[i] - prev >= gap)
                {
                    prev = a[i];
                    placed++;
                }
                if(placed == m)
                {
                    return true;
                }
            }
            if(placed < m)
            {
                return false;
            }
            return true;
        }
    }
}
