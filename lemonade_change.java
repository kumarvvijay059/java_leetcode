public class lemonade_change {
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            boolean ans = true;
            int[] ihave = {0,0,0};
            int n = bills.length;
            //int d = 0;
            for(int i = 0 ; n>i ; i++)
            {
                if(bills[i]==5)
                {
                    ihave[0]++;
                }
                else if(bills[i]==10)
                {
                    if(ihave[0]>=1)
                    {
                        ihave[0]--;
                        ihave[1]++;
                    }
                    else
                    {
                        ans = false;
                        break;
                    }
                }
                else
                {
                    if(ihave[0]>=1 && ihave[1]>=1)
                    {
                        ihave[0]--;
                        ihave[1]--;
                        ihave[2]++;
                    }
                    else if(ihave[0]>=3)
                    {
                        ihave[0]--;
                        ihave[0]--;
                        ihave[0]--;
                        ihave[2]++;
                    }
                    else
                    {
                        ans = false;
                        break;
                    }
                }
            }
            return ans;
        }
    }
}
