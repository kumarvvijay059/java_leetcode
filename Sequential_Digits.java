import java.util.*;
import java.lang.*;
import java.io.*;
public class Sequential_Digits {
    class Solution {
        public List<Integer> sequentialDigits(int low, int high) {
            int l = String.valueOf(low).length();
            int h = String.valueOf(high).length();
            String nums = "123456789";
            List<Integer> al = new ArrayList<>();
            for(int i = l ; i<=h ; i++)
            {
                for(int j = 0 ; j<10-i ; j++)
                {
                    int val = Integer.parseInt(nums.substring(j , j+i));
                    if(val >= low && val <= high)
                    {
                        al.add(val);
                    }
                }
            }
            return al;
        }
    }
}
