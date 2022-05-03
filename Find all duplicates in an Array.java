class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
           
            if(!hs.containsKey(nums[i]))
            hs.put(nums[i],1);
            else
                hs.put(nums[i],hs.get(nums[i])+1);
        }
         for (Map.Entry<Integer, Integer> entry : hs.entrySet())
        {
             if(entry.getValue()>1)
                   list.add(entry.getKey());
            // System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return list;
    }
}
