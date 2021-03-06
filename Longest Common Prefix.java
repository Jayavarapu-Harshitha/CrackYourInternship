class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort( strs );
        
        int n = strs.length;
       
        String first = strs[0];
        String last = strs[n-1];
        
        for(int i=0; i<first.length(); i++) {
         
            if( first.charAt(i) != last.charAt(i) ) {
                return first.substring(0, i);
            }
        }
        
        return first;
    }
}
