import java.util.*;
import java.io.*;
import java.lang.*;
public class Crawler_Log_Folder {
    class Solution {
        public int minOperations(String[] logs) {
            int count = 0;
            for(String s : logs)
            {
                if(s.equals("../"))
                {
                    if(count == 0)
                    {
                        continue;
                    }
                    else
                    {
                        count--;
                    }
                }
                else if(s.equals("./"))
                {
                    continue;
                }
                else
                {
                    count++;
                    System.out.println(s);
                }
            }
            return count;
        }
    }
}
