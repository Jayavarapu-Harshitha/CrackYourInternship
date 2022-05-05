class Solution {
public void gameOfLife(int[][] a) {
int m= a.length;
int n=a[0].length;
int[][] res=new int[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
int count1=0;
//First Check **********************************************************************
if((i-1>=0)&&(a[i-1][j]>=1))
count1++;

            if((i+1<m)&&(a[i+1][j]>=1))                 
                count1++;
           
            if((j-1>=0)&&(a[i][j-1]>=1))                    
                count1++;
            
            if((j+1<n)&&(a[i][j+1]>=1))                   
                count1++;
           
            if((i-1>=0 && j-1>=0)&&(a[i-1][j-1]>=1))                  
                count1++;
           
             if((i+1<m && j-1>=0)&&(a[i+1][j-1]>=1))                 
                count1++;
            
             if((i-1>=0 && j+1<n)&&(a[i-1][j+1]>=1))                 
                count1++;
            
             if((i+1<m && j+1<n)&&(a[i+1][j+1]>=1))                   
                count1++;
            if(a[i][j]>=1)
            {
                if(count1<2)
                    a[i][j]=2;
                else if(count1>3)
                    a[i][j]=2;                   
            }
            else
            {
                if(count1==3)
                    a[i][j]=-1;  
            }      
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
if(a[i][j]==2)
a[i][j]=0;
else if(a[i][j]==-1)
a[i][j]=1;
}
}

        }
    }
