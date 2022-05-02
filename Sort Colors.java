class Solution {
    public void sortColors(int[] nums) {
        int ones=0,zeroes=0,twos=0;
      
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                zeroes++;
            else if(nums[i]==1)
                ones++;
            else 
                twos++;
            
        }
        int j=0;
        for(int i=0;i<zeroes;i++)
        {
            nums[j]=0;
            j++;
        }
        for(int i=0;i<ones;i++)
        {
            nums[j]=1;
           
            j++;
        }
        for(int i=0;i<twos;i++)
        {
            nums[j]=2;
            j++;
            
        }
      
    }
}
