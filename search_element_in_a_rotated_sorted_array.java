class search_element_in_a_rotated_sorted_array {
    public int search(int[] nums, int target)
    {
        int size = nums.length;
        int l = 0;
        int h = size - 1;
        int mid;
        while(l<=h)
        {
            mid = (l+h)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[l]<=nums[mid])
            {
                if(nums[l]<=target && nums[mid]>=target)
                {
                    h = mid - 1;
                }
                else
                {
                    l = mid + 1;
                }
            }
            else
            {
                if(nums[mid]<=target && nums[h]>=target)
                {
                    l = mid + 1;
                }
                else
                {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
}