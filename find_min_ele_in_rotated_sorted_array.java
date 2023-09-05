class find_min_ele_in_a_rotated_sorted_array {
    public int findMin(int[] nums)
    {
        int size = nums.length;
        int l = 0;
        int h = size-1;
        int mid;
        while(l<=h)
        {
            mid = (l+h)/2;
            // if(l==mid - 1 && h==mid+1)
            // {
            //     if(nums[l]>=nums[mid] && nums[h]>=nums[mid])
            //     {
            //         return nums[mid];
            //     }
            // }
            if(mid-1>=0&&mid+1<size&&nums[mid]<=nums[mid-1]&&nums[mid]<=nums[mid+1])
            {
                return nums[mid];
            }
            if(nums[l]<=nums[mid] && nums[mid]<=nums[h])
            {
                return nums[l];
            }
            else if(nums[l]<=nums[mid])
            {
                l = mid + 1;
            }
            else
            {
                h = mid - 1;
            }
        }
        return nums[l];
    }
}