class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res=new LinkedList<>();
        int top=0,down=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        while(true)
        {
            for(int i=left;i<=right;i++)
            {
                res.add(matrix[top][i]);
            }
            top++;
            if(top>down || left>right)
                break;
            for(int i=top;i<=down;i++)
            {
                res.add(matrix[i][right]);
            }
            right--;
            if(top>down || left>right) break;
            for(int i=right;i>=left;i--)
            {
                res.add(matrix[down][i]);
            }
            down--;
            if(top>down || left>right)
                break;
            for(int i=down;i>=top;i--)
            {
                res.add(matrix[i][left]);
            }
            left++;
            if(top>down || left>right)break;
        }
        return res;
    }
}
