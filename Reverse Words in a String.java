class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll(" +"," ");
        String ar[]=s.split(" ");
        String str="";
        for(int i=ar.length-1;i>=0;i--)
        {
            str+=ar[i]+" ";
        }
        return str.trim();
    }
}
