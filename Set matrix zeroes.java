class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] temp= new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                temp[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int k=0;k<matrix.length;k++)
                    {
                        temp[k][j]=0;
                    }
                    for(int p=0;p<matrix[0].length;p++)
                    {
                        temp[i][p]=0;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                    matrix[i][j]=temp[i][j];
            }
        }
        
        
    }
}
