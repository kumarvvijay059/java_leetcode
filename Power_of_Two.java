import java.util.*;
import java.io.*;
import java.lang.*;
public class Power_of_Two {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if(n<=0)
            {
                return false;
            }
            while(n>0)
            {
                if(n==1)
                {
                    return true;
                }
                int r = n%2;
                if(r != 0)
                {
                    return false;
                }
                n = n/2;
            }
            return true;
        }
    }
}
