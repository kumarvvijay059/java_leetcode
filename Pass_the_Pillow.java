import java.util.*;
import java.io.*;
import java.lang.*;
public class Pass_the_Pillow {
    class Solution {
        public int passThePillow(int n, int time) {
            int i = 1;
            boolean frwd = true;
            while(time>0)
            {
                if(i == n)
                {
                    frwd = false;
                }
                if(i == 1 && frwd == false)
                {
                    frwd = true;
                }
                if(frwd)
                {
                    i++;
                }
                else
                {
                    i--;
                }
                time--;
            }
            return i;
        }
    }

}
