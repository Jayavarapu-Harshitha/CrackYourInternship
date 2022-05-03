public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            Integer requiredNum = (Integer)(target - nums[i]);
            if(h.containsKey(requiredNum)){
                int a[] = {h.get(requiredNum), i};
                return a;
            }

            h.put(nums[i], i);
        }
        return null;
    }
}
