class Solution {
public int maxScore(int[] A, int k) {

    int curr = 0, max = -1,n = A.length;
    
    for(int i = 0; i<k;i++){
        curr += A[i];
    }
    int l = k-1;
    max = curr;
    for(int i = n-1; i>=n-k;i--){
        
        curr += A[i];
        curr -= A[l--];
        max = Math.max(max, curr);
    }
    
    return max;
}
}
