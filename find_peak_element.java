class Solution {
    public int findPeakElement(int[] nums)
    {
        int size = nums.length;
        int l = 0;
        int h = size - 1;
        int mid = 0;
        if(size==1)
        {
            return 0;
        }
        while(l<=h)
        {
            mid = (l+h)/2;
            if(mid==0)
            {
                if(nums[mid]>nums[mid+1])
                {
                    return mid;
                }
                else
                {
                    return mid+1;
                }
            }
            else if(mid==size-1)
            {
                if(nums[mid]>nums[mid-1])
                {
                    return mid;
                }
                else
                {
                    return mid-1;
                }
            }
            else
            {
                if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid - 1])
                {
                    return mid;
                }
                else if(nums[mid]<nums[mid-1]&&nums[mid]<nums[mid+1])
                {
                    if(nums[mid+1]>nums[mid-1])
                    {
                        l = mid + 1;
                    }
                    else
                    {
                        h = mid - 1;
                    }
                }
                else if(nums[mid]<nums[mid+1])
                {
                    l = mid + 1;
                }
                else if(nums[mid]<nums[mid-1])
                {
                    h = mid - 1;
                }
            }

        }
        return mid;
    }
}