class Solution {
    public boolean isPossible(long a[], long b[], long n, long k) {
       Arrays.sort(a);
       Arrays.sort(b, Collections.reverseOrder());
       long count=0;
       for(int i=0;i<n;i++)
       {
           if(a[i]+b[i]<k)
            return false;
       }
 
       return true;
      
    }
}
