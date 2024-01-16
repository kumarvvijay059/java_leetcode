import java.io.*;
import java.lang.*;
import java.util.*;
public class Insert_Delete_GetRandom_O_of_1 {
    class RandomizedSet {

        HashMap<Integer , Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        public RandomizedSet() {

        }

        public boolean insert(int val) {
            if(hm.containsKey(val))
            {
                return false;
            }
            else
            {
                al.add(val);
                hm.put(val , al.size()-1);
                return true;
            }
        }

        public boolean remove(int val) {
            if(hm.containsKey(val))
            {
                //al.remove(hm.get(val));
                al.set(hm.get(val) , al.get(al.size()-1));
                hm.put(al.get(al.size()-1) , hm.get(val));
                hm.remove(val);
                al.remove(al.size()-1);
                return true;
            }
            else
            {
                return false;
            }
        }

        public int getRandom() {
            double r = Math.random();
            int rn = (int)(r * (al.size() - 0)) + 0;
            return al.get(rn);
        }
    }
}
