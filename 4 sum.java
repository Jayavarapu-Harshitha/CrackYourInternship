class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> res=new HashSet<>();
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                int p1=j+1;
                int p2=nums.length-1;
                int a=nums[i];
                int b=nums[j];
                while(p1<p2)
                {
                    int c=nums[p1];
                    int d=nums[p2];
                    int sum=a+b+c+d;
                    if(sum==target)
                    {
                        ArrayList<Integer> arr=new ArrayList<>();
                        arr.add(a);
                        arr.add(b);
                        arr.add(c);
                        arr.add(d);
                        res.add(arr);
                        p1++;
                    }
                    if(sum<target)
                        p1++;
                    else
                        p2--;
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.addAll(res);
        return ans;
    }
}
