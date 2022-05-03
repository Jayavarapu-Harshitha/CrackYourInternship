class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
       Collections.sort(a);
       long mindifference=Long.MAX_VALUE;
       for(int i=0;i+m-1<n;i++)
       {
           mindifference=Math.min(a.get(i+(int)m-1)-a.get(i),mindifference);
       }
       return mindifference;
    }
}
