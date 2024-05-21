class single_element_in_a_sorted_array {
    public int singleNonDuplicate(int[] nums)
    {
        int size = nums.length;
        int l = 0;
        int h = size - 1;
        int mid = 0;
        while(l<=h)
        {
            mid = (l+h)/2;
            if(mid+1<size && nums[mid]==nums[mid+1])
            {
                if((h-mid+1)%2!=0)
                {
                    l = mid + 2;
                }
                else
                {
                    h = mid - 1;
                }
            }
            else if(mid-1>=0 && nums[mid]==nums[mid-1])
            {
                if((mid+1)%2!=0)
                {
                    h = mid - 2;
                }
                else
                {
                    l = mid + 1;
                }
            }
            else
            {
                return nums[mid];
            }
        }
        return nums[mid];
    }
}