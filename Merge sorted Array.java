class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int left=m-1;
        int right=n-1;
        int pointer=m+n-1;
        if(m+n==1 && n!=0)
        {
            nums1[m]=nums2[0];
        }
        else if(m+n==2)
        {
            if(nums1[0]>=nums2[0])
                nums1[1]=nums1[0];
            else
                nums1[1]=nums2[0];
            if(nums1[0]<=nums2[0])
                nums1[0]=nums1[0];
             else
                 nums1[0]=nums2[0];
        }
        else
        {
            while(right>=0)
            {
                if(left>=0 && nums1[left]>nums2[right])
                {
                    nums1[pointer]=nums1[left];
                    pointer--;
                    left--;
                }
                else
                {
                    nums1[pointer]=nums2[right];
                    pointer--;
                    right--;
                }
            }
        }
        
    }
}
