class first_and_last_occurrence {
    public int[] searchRange(int[] nums, int target) {
        int size = nums.length;
        int l = 0;
        int h = size - 1;
        int mid;
        int[] ans = {-1,-1};
        while(l<=h)
        {
            mid = (l+h)/2;
            if(nums[mid] == target)
            {
                ans[1] = mid;
                l = mid + 1;
            }
            else if(nums[mid]>target)
            {
                h = mid -  1;
            }
            else
            {
                l = mid + 1;
            }
        }
        l = 0;
        h = size - 1;
        while(l<=h)
        {
            mid = (l+h)/2;
            if(nums[mid] == target)
            {
                ans[0] = mid;
                h = mid - 1;
            }
            else if(nums[mid]>target)
            {
                h = mid -  1;
            }
            else
            {
                l = mid + 1;
            }
        }
        return ans;
    }
}
