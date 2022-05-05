 class Solution {
    public boolean canJump(int[] nums) {
        
          if (nums.length == 1) {
        return true;
    }
    int maxPos = nums[0];
    for (int i = 1; i <= maxPos; i++) {
        if (i+nums[i] >= nums.length-1) {
            return true;
        }
        maxPos = Math.max(maxPos, i+nums[i]);
    }
    return false;
       
    }
}
