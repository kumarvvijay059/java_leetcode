public class Bitwise_AND_of_Numbers_Range {
    class Solution {
        public int rangeBitwiseAnd(int left, int right) {
            int count = 0;
            while(left != right)
            {
                left = left >> 1;
                right = right >> 1;
                count++;
            }
            // return left << count;  both is correct since left = right
            return right << count;
        }
    }
}
