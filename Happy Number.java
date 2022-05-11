class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n>1 && !set.contains(n))
        {
           set.add(n);
            n=Sumofsquare(n);
        }
        if(n==1)
            return true;
        else
            return false;
    }
    private int Sumofsquare(int n)
    {
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum+=r*r;
            n=n/10;
        }
        return sum;
    }
}
