import java.util.*;
import java.io.*;
import java.lang.*;
public class Number_of_Students_Unable_to_Eat_Lunch {
    class Solution {
        public int countStudents(int[] students, int[] sandwiches)
        {
            int n = students.length;
            int count1 = 0;
            int count0 = 0;
            for(int i = 0 ; i<n ; i++)
            {
                if(students[i] == 1)
                {
                    count1++;
                }
                else
                {
                    count0++;
                }
            }

            for(int i = 0 ; i<n ; i++)
            {
                if(sandwiches[i] == 0)
                {
                    if(count0 == 0)
                    {
                        return n - i;
                    }
                    count0--;
                }
                else
                {
                    if(count1 == 0)
                    {
                        return n - i;
                    }
                    count1--;
                }
            }
            return 0;
        }
    }
}
