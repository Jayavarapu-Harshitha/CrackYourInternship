class Solution {
    public int reversePairs(int[] nums) {
        int ans=0,n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(nums[i]);
        }
        Collections.sort(list);
        for(int i=0;i<n;i++)
        {
            int start=0,end=list.size()-1;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(nums[i]==list.get(mid))
                {
                    list.remove(mid);
                    break;
                }
                else if(nums[i]<list.get(mid))
                    end=mid-1;
                else
                    start=mid+1;
            }
            start=0;
            end=list.size()-1;
            int val=0;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(nums[i]>(long)2*list.get(mid))
                {
                    if((mid+1)>val)
                        val=mid+1;
                    start=mid+1;
                }
                else
                    end=mid-1;
            }
            ans+=val;
        }
        return ans;
    }
}
