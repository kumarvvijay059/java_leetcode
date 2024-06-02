class searching_ele_in_2d_sorted_array {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
        {
            return false;
        }
        int r = matrix.length;
        int c = matrix[0].length;
        int l = 0;
        int h = (r*c)-1;
        int mid;
        while(l<=h)
        {
            mid = (l+h)/2;
            if(matrix[mid/c][mid%c]==target)
            {
                return true;
            }
            else if(matrix[mid/c][mid%c]<target)
            {
                l = mid+1;
            }
            else
            {
                h = mid-1;
            }
        }
        return false;
    }
}