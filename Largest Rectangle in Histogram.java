class Solution {
    public int largestRectangleArea(int[] heights) {
        int size = heights.length;
        
        int[] leftSmall = new int[size];
        int[] rightSmall = new int[size];
        
        Stack<Integer> stack = new Stack<>();
    
        for(int i = 0; i < size; i++) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            } 
            
            if(stack.isEmpty()) {
                leftSmall[i] = 0;
            } else {
                leftSmall[i] = stack.peek() + 1;
            }
            
            stack.push(i);
        }
        
        while(!stack.isEmpty()) {
            stack.pop();    
        }   
        
        for(int i = size - 1; i >= 0; i--) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            
            if(stack.isEmpty()) {
                rightSmall[i] = size - 1;
            } else {
                rightSmall[i] = stack.peek() - 1;
            }
            
            stack.push(i);
        }
        
        int maxArea = 0;
        
        for(int i = 0; i < size; i++) {
            int currArea = (rightSmall[i] - leftSmall[i] + 1) * heights[i];
            maxArea = Math.max(currArea, maxArea);
        }
        
        return maxArea;
    }
}
