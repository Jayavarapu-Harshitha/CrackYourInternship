class Solution {
    public String convertToTitle(int columnNumber) {
        int col=columnNumber;
        StringBuilder res=new StringBuilder();
        while(col>0)
        {
            col--;
            res.insert(0,(char)('A'+col%26));
            col/=26;
        }
        return res.toString();
    }
}
