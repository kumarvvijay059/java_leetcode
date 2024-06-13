import java.util.*;
import java.io.*;
import java.lang.*;
public class Minimum_Number_of_Moves_to_Seat_Everyone {
    class Solution {
        public int minMovesToSeat(int[] seats, int[] students) {
            int n = seats.length;
            Arrays.sort(seats);
            Arrays.sort(students);
            int sum = 0;
            for(int i = 0 ; i<n ; i++)
            {
                sum = sum + Math.abs(seats[i] - students[i]);
            }
            return sum;
        }
    }
}
