import java.util.*;
public class Number_of_Senior_Citizens {
    class Solution {
        public int countSeniors(String[] details) {
            int num_of_pass = 0;
            for(int i = 0 ; i<details.length ; i++)
            {
                String temp = details[i].substring(11 , 13);
                int age = Integer.parseInt(temp);
                if(age>60)
                {
                    num_of_pass++;
                }
            }
            return num_of_pass;
        }
    }
}
