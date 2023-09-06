class find_peak_element_2 {
    public int[] findPeakGrid(int[][] mat)
    {
        int lr = 0;
        int hr = mat.length - 1;
        int midr;
        while(lr<=hr)
        {
            midr = (lr+hr)/2;
            int max_element = maxElementInRow(mat[midr] , mat[midr].length);
            if(midr==0)
            {
                if(mat[midr][max_element]>mat[midr + 1][max_element])
                {
                    return new int[]{midr , max_element};
                }
            }
            else if(midr==mat.length - 1)
            {
                if(mat[midr][max_element]>mat[midr - 1][max_element])
                {
                    return new int[]{midr , max_element};
                }
            }
            else
            {
                if(mat[midr][max_element]>mat[midr - 1][max_element] && mat[midr][max_element]>mat[midr + 1][max_element])
                {
                    return new int[]{midr , max_element};
                }
            }
            if(mat[midr][max_element]<mat[midr + 1][max_element])
            {
                lr = midr + 1;
            }
            else
            {
                hr = midr - 1;
            }
        }
        return new int[]{-1,-1};
    }
    private int maxElementInRow(int[] arr , int n)
    {
        int max = 0;
        int index = 0;
        for(int j = 0 ; j<n ; j++)
        {
            if(max<arr[j])
            {
                max = arr[j];
                index = j;
            }
        }
        return index;
    }
}