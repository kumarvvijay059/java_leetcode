import java.util.*;
import java.io.*;
import java.lang.*;
public class Sort_an_Array {
    class Solution {
        public int[] sortArray(int[] nums) {
            mergeSort(nums , 0 , nums.length-1);
            return nums;
        }

        private void mergeSort(int[] nums , int l , int h)
        {
            if(l<h)
            {
                int mid = (l+h)/2;
                mergeSort(nums , l , mid);
                mergeSort(nums , mid+1 , h);
                merge(nums , l , mid , h);
            }
        }

        private void merge(int[] nums , int l , int mid , int h)
        {
            int n1 = mid-l+1;
            int n2 = h-mid;
            int left[] = new int[n1];
            int right[] = new int[n2];
            for(int i = 0; i<n1 ; i++)
            {
                left[i] = nums[l+i];
            }
            for(int j = 0 ; j<n2 ; j++)
            {
                right[j] = nums[mid+1+j];
            }

            int i = 0;
            int j = 0;
            int k = l;
            while(i<n1 && j<n2)
            {
                if(left[i] <= right[j])
                {
                    nums[k] = left[i];
                    i++;
                    k++;
                }
                else
                {
                    nums[k] = right[j];
                    j++;
                    k++;
                }
            }
            while(i<n1)
            {
                nums[k] = left[i];
                i++;
                k++;
            }
            while(j<n2)
            {
                nums[k] = right[j];
                j++;
                k++;
            }
        }
    }
}
