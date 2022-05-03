class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int remainder=sum%k;
            if(remainder<0)
                remainder+=k;
            if(hs.containsKey(remainder))
            {
                count+=hs.get(remainder);
            }
            hs.put(remainder,hs.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}
