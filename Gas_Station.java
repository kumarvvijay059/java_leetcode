import java.util.*;
public class Gas_Station {
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int n = gas.length;
            int totalgas = 0;
            int currgas = 0;
            int st_ind = 0;
            for(int i = 0 ; i<n ; i++)
            {
                int netgas = gas[i] - cost[i];
                totalgas += netgas;
                currgas += netgas;
                if(currgas < 0)
                {
                    st_ind = i+1;
                    currgas = 0;
                }
            }
            if(totalgas >= 0)
            {
                return st_ind;
            }
            return -1;
        }
    }
}
