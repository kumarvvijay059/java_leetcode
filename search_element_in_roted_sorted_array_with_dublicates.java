class search_element_in_roted_sorted_array_with_dublicates{
    public boolean search(int[] nums, int target)
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
                return true;
            }
            else if(nums[l]==nums[mid] && nums[mid]==nums[h])
            {
                l++;
                h--;
            }
            else if(nums[l]<=nums[mid])
            {
                if(nums[l]<=target && nums[mid]>=target)
                {
                    h = mid - 1;
                }
                // else if(nums[l]==nums[mid])
                // {
                //     if(mid - l == 2)
                //     {
                //         if(nums[mid - 1]==target)
                //         {
                //             return true;
                //         }
                //     }
                //}
                else
                {
                    l = mid + 1;
                }
            }
            // else if(nums[l]==nums[mid])
            // {
            //     if(mid - l==2)
            //     {
            //         if(nums[mid-1]==target)
            //         {
            //             return true;
            //         }
            //     }
            // }
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
        return false;
    }
}
