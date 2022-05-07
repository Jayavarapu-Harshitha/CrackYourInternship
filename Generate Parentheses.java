class Solution {
    public List<String> generateParenthesis(int n) {
    
        List<String> result = new ArrayList<>();
        helper(n, 0, 0, new StringBuilder(), result);
        return result;
    }
    
    private void helper(int n, int open, int close, StringBuilder sb, List<String> result) {
        if(n == open && n == close) {
            result.add(sb.toString());
            return;
        }
        if(open < n) {
            helper(n, open+1, close, sb.append('('), result);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close < open) {
            helper(n, open, close+1, sb.append(')'), result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
