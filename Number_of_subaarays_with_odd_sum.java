import java.util.*;
public class Number_of_subaarays_with_odd_sum {
    public class Main
    {
        public static void main(String[] args) {
            System.out.println("Hello World");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] A = new int[n];
            for(int i = 0 ; i<n ; i++)
            {
                A[i] = sc.nextInt();
            }
            int ans = fun(A , n);
            System.out.println(ans);
        }

        private static int fun(int[] A , int n)
        {
            int ans = 0;
            int even_count = 0;
            int odd_count = 0;
            int sum = 0;
            for(int num : A)
            {
                sum += num;
                if(sum % 2 == 1)
                {
                    odd_count += 1;
                    ans += even_count + 1;
                }
                else
                {
                    even_count += 1;
                    ans += odd_count;
                }
            }
            return ans;
        }
    }
}
